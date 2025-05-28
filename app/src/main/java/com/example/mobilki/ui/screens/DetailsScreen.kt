package com.example.mobilki.ui.screens

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.mobilki.data.model.Product
import com.example.mobilki.data.repository.ProductsRepository
import com.example.mobilki.ui.VideoPlayer
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

sealed class MediaItemData {
    data class Image(val resId: Int) : MediaItemData()
    data class Video(val uri: Uri) : MediaItemData()
}

@Composable
fun DetailsScreen(productId: Int, onBackClick: () -> Boolean) {
    val product = remember { ProductsRepository.getProductById(productId) }
    var selectedTab by remember { mutableStateOf(DetailsTab.Description) }
    val coroutineScope = rememberCoroutineScope()
    val pagerState = rememberPagerState {
        DetailsTab.entries.size
    }

    LaunchedEffect(pagerState.currentPage) {
        selectedTab = DetailsTab.entries[pagerState.currentPage]
    }

    Scaffold(
        bottomBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(64.dp)
                    .background(Color(0xFFB87C7C)),
            ) {
                DetailsTab.entries.forEach { tab ->
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .clickable { selectedTab = tab
                                coroutineScope.launch {
                                    pagerState.animateScrollToPage(page = DetailsTab.entries.indexOf(tab))
                                }
                            }
                            .background(if (tab == selectedTab) Color.Red else Color(0xFFB87C7C)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = tab.title,
                            color = Color.White,
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        },
        containerColor = Color(0xFFFFC0CB)
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                IconButton(onClick = { onBackClick() }) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                }
                Text(
                    text = if (selectedTab == DetailsTab.Description) "Opis" else "Galeria",
                    style = MaterialTheme.typography.titleLarge
                )
            }

            HorizontalPager(
                state = pagerState
            ) { page ->
                when (DetailsTab.entries[page]) {
                    DetailsTab.Description -> DescriptionTab(product, Modifier.weight(1f))
                    DetailsTab.Gallery -> GalleryTab(product, Modifier.weight(1f))
                }
            }
        }
    }
}
enum class DetailsTab(val title: String) {
    Description("Opis"),
    Gallery("Galeria")
}

@Composable
fun DescriptionTab(product: Product, weight: Modifier) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = product.imageRes),
            contentDescription = product.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = product.name,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = product.description,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Start,
            modifier = Modifier.verticalScroll(scrollState)
        )
    }
}

@Composable
fun GalleryTab(product: Product, weight: Modifier) {
    val context = LocalContext.current
    val resources = context.resources
    val packageName = context.packageName

    val galleryItems = remember(product) {
        product.gallery.map { id ->
            when (resources.getResourceTypeName(id)) {
                "drawable" -> MediaItemData.Image(id)
                "raw" -> {
                    val uri = Uri.parse("android.resource://$packageName/$id")
                    MediaItemData.Video(uri)
                }
                else -> throw IllegalArgumentException("Unknown resource type for ID $id")
            }
        }
    }

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(galleryItems) { item ->
            when (item) {
                is MediaItemData.Image -> {
                    Image(
                        painter = painterResource(id = item.resId),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(1f)
                    )
                }

                is MediaItemData.Video -> {
                    VideoPlayer(
                        uri = item.uri,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(1f)
                    )
                }
            }
        }
    }
}
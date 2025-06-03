package com.example.mobilki.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.LinearEasing
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun SpinningArrowBackIcon(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    var isSpinning by remember { mutableStateOf(false) }

    val rotation by animateFloatAsState(
        targetValue = if (isSpinning) 360f else 0f,
        animationSpec = tween(
            durationMillis = 300,
            easing = LinearEasing
        ),
        finishedListener = { isSpinning = false },
        label = "arrowClickSpin"
    )

    Icon(
        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
        contentDescription = "Back",
        modifier = modifier
            .graphicsLayer(rotationZ = rotation)
            .clickable {
                isSpinning = true
                onClick()
            }
            .padding(end = 8.dp)
    )
}


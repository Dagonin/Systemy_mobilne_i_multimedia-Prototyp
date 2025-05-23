package com.example.mobilki.navigation

import WelcomeScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mobilki.data.repository.ProductsRepository
import com.example.mobilki.ui.screens.CategoriesScreen
import com.example.mobilki.ui.screens.DetailsScreen
import com.example.mobilki.ui.screens.ProductsScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "WelcomeScreen") {
        composable("WelcomeScreen") {
            WelcomeScreen(
                onButtonClicked = {
                    navController.navigate("categories")
                }
            )
        }


        composable("categories") {
            CategoriesScreen(
                onCategorySelected = { category ->
                    navController.navigate("products/$category")
                }
            )
        }

        composable(
            route = "products/{category}",
            arguments = listOf(navArgument("category") { type = NavType.StringType })
        ) { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category") ?: ""
            ProductsScreen(
                category = category,
                onProductSelected = { productId ->
                    navController.navigate("details/$productId")
                },
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(
            route = "details/{productId}",
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId") ?: 0
            DetailsScreen(productId = productId, onBackClick = { navController.popBackStack() })
        }
    }
}
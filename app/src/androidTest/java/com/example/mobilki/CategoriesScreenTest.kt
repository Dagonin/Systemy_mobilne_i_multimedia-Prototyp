package com.example.mobilki.ui.screens

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import org.junit.Rule
import org.junit.Test

class CategoriesScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun categoriesScreen_displaysTitleAndCategories_andHandlesClicks() {
        var selectedCategory = ""
        var backClicked = false

        composeTestRule.setContent {
            MaterialTheme {
                CategoriesScreen(
                    onCategorySelected = { selectedCategory = it },
                    onBackClicked = { backClicked = true }
                )
            }
        }

        // Verify title is displayed
        composeTestRule.onNodeWithText("Wybierz kategorię:").assertIsDisplayed()

        // Verify categories buttons are displayed
        listOf("Owoce", "Warzywa\nliściaste", "Warzywa\nkorzeniowe").forEach {
            composeTestRule.onNodeWithText(it).assertIsDisplayed()
        }

        // Click "Owoce" category button
        composeTestRule.onNodeWithText("Owoce").performClick()
        assert(selectedCategory == "Owoce")

        // Click back arrow icon (contentDescription = "Wróć")
        composeTestRule.onNodeWithContentDescription("Wróć").performClick()
        assert(backClicked)
    }
}

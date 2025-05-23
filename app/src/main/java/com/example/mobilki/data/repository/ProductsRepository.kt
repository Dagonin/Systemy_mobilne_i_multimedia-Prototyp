package com.example.mobilki.data.repository

import com.example.mobilki.R

import com.example.mobilki.data.model.Product

object ProductsRepository {
    private val products = listOf(
        Product(
            id = 1,
            name = "Jabłko",
            category = "Owoce",
            description = "Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,R.drawable.apple1,)

        ),
        Product(
            id = 2,
            name = "Cytryna",
            category = "Owoce",
            description = "Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 3,
            name = "Gruszka",
            category = "Owoce",
            description = "Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 4,
            name = "Banan",
            category = "Owoce",
            description = "Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 5,
            name = "Sałata",
            category = "Warzywa liściaste",
            description = "Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        Product(
            id = 9,
            name = "Marchew",
            category = "Warzywa korzeniowe",
            description = "Lorem ipsum...",
            imageRes = R.drawable.apple1,
            gallery = listOf(R.drawable.apple1, R.raw.sample_video)
        ),
        // Dodaj pozostałe produkty...
    )

    fun getProductsByCategory(category: String) = products.filter { it.category == category }
    fun getProductById(id: Int) = products.first { it.id == id }
}
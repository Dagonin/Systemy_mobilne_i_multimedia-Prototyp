package com.example.mobilki.data.model

import android.net.Uri


data class Product(
    val id: Int,
    val name: String,
    val category: String,
    val description: String,
    val imageRes: Int,
    val gallery: List<Int>
)
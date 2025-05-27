package com.example.mobilki
import com.example.mobilki.data.model.Product
import com.example.mobilki.data.repository.ProductsRepository
import org.junit.Assert.*
import org.junit.Test

class ProductsRepositoryTest {

    @Test
    fun getProductsByCategory_returnsCorrectProducts() {
        val owoce = ProductsRepository.getProductsByCategory("Owoce")
        assertEquals(4, owoce.size)
        assertTrue(owoce.any { it.name == "Jabłko" })
        assertTrue(owoce.all { it.category == "Owoce" })
    }

    @Test
    fun getProductsByCategory_returnsEmptyListForUnknownCategory() {
        val unknown = ProductsRepository.getProductsByCategory("Nieistniejąca kategoria")
        assertTrue(unknown.isEmpty())
    }

    @Test
    fun getProductById_returnsCorrectProduct() {
        val product = ProductsRepository.getProductById(1)
        assertEquals("Jabłko", product.name)
        assertEquals("Owoce", product.category)
    }

    @Test(expected = NoSuchElementException::class)
    fun getProductById_throwsExceptionForInvalidId() {
        ProductsRepository.getProductById(-1)
    }
}

package com.inventech.Inventech.service

import com.inventech.Inventech.model.Producto
import com.inventech.Inventech.repository.ProductoRepository
import org.springframework.stereotype.Service

@Service
class ProductoService(private val productRepository: ProductoRepository) {

    fun getAllProducts(): List<Producto> = productRepository.findAll()

    fun getProductById(id: Long): Producto? = productRepository.findById(id).orElse(null)

    fun createProduct(product: Producto): Producto = productRepository.save(product)

    fun updateProduct(id: Long, updatedProduct: Producto): Producto? {
        val existing = productRepository.findById(id)
        return if (existing.isPresent) {
            val prod = existing.get().copy(
                nombre = updatedProduct.nombre,
                descripcion = updatedProduct.descripcion,
                precio = updatedProduct.precio,
                stock = updatedProduct.stock
            )
            productRepository.save(prod)
        } else null
    }

    fun deleteProduct(id: Long): Boolean {
        return if (productRepository.existsById(id)) {
            productRepository.deleteById(id)
            true
        } else false
    }
}
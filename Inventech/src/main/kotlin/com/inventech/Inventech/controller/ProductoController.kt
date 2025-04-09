package com.inventech.Inventech.controller

import com.inventech.Inventech.model.Producto
import com.inventech.Inventech.service.ProductoService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/admin/productos")
class ProductoController(private val productService: ProductoService) {

    @GetMapping
    fun getAllProductos(): List<Producto> = productService.getAllProducts()

    @GetMapping("/{id}")
    fun getProductoById(@PathVariable id: Long): ResponseEntity<Producto> {
        val product = productService.getProductById(id)
        return if (product != null) ResponseEntity.ok(product)
        else ResponseEntity.notFound().build()
    }

    @PostMapping
    fun createProducto(@RequestBody product: Producto): Producto = productService.createProduct(product)

    @PutMapping("/{id}")
    fun updateProducto(@PathVariable id: Long, @RequestBody product: Producto): ResponseEntity<Producto> {
        val updated = productService.updateProduct(id, product)
        return if (updated != null) ResponseEntity.ok(updated)
        else ResponseEntity.notFound().build()
    }

    @DeleteMapping("/{id}")
    fun deleteProducto(@PathVariable id: Long): ResponseEntity<Void> {
        return if (productService.deleteProduct(id)) ResponseEntity.noContent().build()
        else ResponseEntity.notFound().build()
    }
}

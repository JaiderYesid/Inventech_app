package com.inventech.Inventech.controller

import com.inventech.Inventech.model.Proveedor
import com.inventech.Inventech.service.ProveedorService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/suppliers")
class ProveedorController(private val supplierService: ProveedorService) {

    @GetMapping
    fun getAllProveedores(): List<Proveedor> = supplierService.getAllSuppliers()

    @GetMapping("/{id}")
    fun getProveedorById(@PathVariable id: Long): ResponseEntity<Proveedor> {
        val supplier = supplierService.getSupplierById(id)
        return if (supplier != null) ResponseEntity.ok(supplier)
        else ResponseEntity.notFound().build()
    }

    @PostMapping
    fun createProveedor(@RequestBody supplier: Proveedor): Proveedor = supplierService.createSupplier(supplier)

    @PutMapping("/{id}")
    fun updateProveedor(@PathVariable id: Long, @RequestBody supplier: Proveedor): ResponseEntity<Proveedor> {
        val updated = supplierService.updateSupplier(id, supplier)
        return if (updated != null) ResponseEntity.ok(updated)
        else ResponseEntity.notFound().build()
    }

    @DeleteMapping("/{id}")
    fun deleteProveedor(@PathVariable id: Long): ResponseEntity<Void> {
        return if (supplierService.deleteSupplier(id)) ResponseEntity.noContent().build()
        else ResponseEntity.notFound().build()
    }
}

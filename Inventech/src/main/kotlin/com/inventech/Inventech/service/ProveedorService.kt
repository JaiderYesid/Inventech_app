package com.inventech.Inventech.service

import com.inventech.Inventech.model.Proveedor
import com.inventech.Inventech.repository.ProveedorRepository
import org.springframework.stereotype.Service

@Service
class ProveedorService(private val supplierRepository: ProveedorRepository) {

    fun getAllSuppliers(): List<Proveedor> = supplierRepository.findAll()

    fun getSupplierById(id: Long): Proveedor? = supplierRepository.findById(id).orElse(null)

    fun createSupplier(supplier: Proveedor): Proveedor = supplierRepository.save(supplier)

    fun updateSupplier(id: Long, updated: Proveedor): Proveedor? {
        val existing = supplierRepository.findById(id)
        return if (existing.isPresent) {
            val updatedSupplier = existing.get().copy(
                nombre = updated.nombre,
                telefono = updated.telefono,
                email = updated.email
            )
            supplierRepository.save(updatedSupplier)
        } else null
    }

    fun deleteSupplier(id: Long): Boolean {
        return if (supplierRepository.existsById(id)) {
            supplierRepository.deleteById(id)
            true
        } else false
    }
}

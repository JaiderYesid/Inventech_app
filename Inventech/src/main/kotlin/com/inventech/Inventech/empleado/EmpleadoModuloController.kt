package com.inventech.Inventech.empleado

import com.inventech.Inventech.model.Producto
import com.inventech.Inventech.repository.ProductoRepository
import com.inventech.Inventech.model.Proveedor
import com.inventech.Inventech.repository.ProveedorRepository
import com.inventech.Inventech.model.Venta
import com.inventech.Inventech.repository.VentaRepository
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/employee")
class EmpleadoModuloController(
    private val productoRepository: ProductoRepository,
    private val proveedorRepository: ProveedorRepository,
    private val VentaRepository: VentaRepository
) {

    // Ver productos
    @GetMapping("/productos")
    fun getProductos(): ResponseEntity<List<Producto>> {
        return ResponseEntity.ok(productoRepository.findAll())
    }

    // Registrar venta
    @PostMapping("/ventas")
    fun registerventa(@Valid @RequestBody sale: Venta): ResponseEntity<Venta> {
        return ResponseEntity.ok(VentaRepository.save(sale))
    }

    // Agregar proveedor
    @PostMapping("/proveedores")
    fun addProveedor(@Valid @RequestBody provider: Proveedor): ResponseEntity<Proveedor> {
        return ResponseEntity.ok(proveedorRepository.save(provider))
    }

    // Eliminar proveedor
    @DeleteMapping("/providers/{id}")
    fun deleteProveedor(@PathVariable id: Long): ResponseEntity<Void> {
        return if (proveedorRepository.existsById(id)) {
            proveedorRepository.deleteById(id)
            ResponseEntity.noContent().build()
        } else {
            ResponseEntity.notFound().build()
        }
    }
}

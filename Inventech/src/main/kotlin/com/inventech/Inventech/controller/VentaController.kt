package com.inventech.Inventech.controller

import com.inventech.Inventech.model.Venta
import com.inventech.Inventech.service.VentaService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/sales")
class VentaController(private val saleService: VentaService) {

    @GetMapping
    fun getAllSales(): List<Venta> = saleService.getAllVentas()

    @GetMapping("/{id}")
    fun getSaleById(@PathVariable id: Long): ResponseEntity<Venta> {
        val sale = saleService.getSaleById(id)
        return if (sale != null) ResponseEntity.ok(sale)
        else ResponseEntity.notFound().build()
    }

    @PostMapping
    fun createSale(@RequestBody venta: Venta): Venta = saleService.createVenta(venta)
}

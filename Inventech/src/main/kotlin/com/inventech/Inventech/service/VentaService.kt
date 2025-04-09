package com.inventech.Inventech.service

import com.inventech.Inventech.model.Venta
import com.inventech.Inventech.repository.VentaRepository
import org.springframework.stereotype.Service

@Service
class VentaService(private val saleRepository: VentaRepository) {

    fun getAllVentas(): List<Venta> = saleRepository.findAll()

    fun getSaleById(id: Long): Venta? = saleRepository.findById(id).orElse(null)

    fun createVenta(sale: Venta): Venta = saleRepository.save(sale)
}

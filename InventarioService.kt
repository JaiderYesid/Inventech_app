package com.inventech.Inventech.service

import com.inventech.Inventech.model.Inventario
import com.inventech.Inventech.repository.InventarioRepository
import org.springframework.stereotype.Service

@Service
class InventarioService(private val inventarioRepository: InventarioRepository) {

    fun listar(): List<Inventario> = inventarioRepository.findAll()

    fun obtenerPorId(id: Long): Inventario? = inventarioRepository.findById(id).orElse(null)

    fun guardar(inventario: Inventario): Inventario = inventarioRepository.save(inventario)

    fun actualizar(id: Long, inventario: Inventario): Inventario {
        val inventarioExistente = inventarioRepository.findById(id).orElseThrow {
            Exception("Inventario no encontrado")
        }

        val actualizado = inventarioExistente.copy(
            registros = inventario.registros,
            productos = inventario.productos,
            fecha = inventario.fecha,
            registro = inventario.registro
        )

        return inventarioRepository.save(actualizado)
    }

    fun eliminar(id: Long) = inventarioRepository.deleteById(id)
}

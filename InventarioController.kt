package com.inventech.Inventech.controller

import com.inventech.Inventech.model.Inventario
import com.inventech.Inventech.service.InventarioService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/inventario")
@CrossOrigin("*")
class InventarioController(private val service: InventarioService) {

    @GetMapping
    fun listar(): List<Inventario> = service.listar()

    @GetMapping("/{id}")
    fun obtener(@PathVariable id: Long): Inventario? = service.obtenerPorId(id)

    @PostMapping
    fun crear(@RequestBody inventario: Inventario): Inventario = service.guardar(inventario)

    @PutMapping("/{id}")
    fun actualizar(@PathVariable id: Long, @RequestBody inventario: Inventario): Inventario =
        service.actualizar(id, inventario)

    @DeleteMapping("/{id}")
    fun eliminar(@PathVariable id: Long) = service.eliminar(id)
}
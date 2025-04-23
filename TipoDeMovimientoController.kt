package com.inventech.Inventech.controller

import com.inventech.Inventech.model.TipoDeMovimiento
import com.inventech.Inventech.service.TipoDeMovimientoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/tipo-de-movimiento")
class TipoDeMovimientoController(
    @Autowired private val tipoDeMovimientoService: TipoDeMovimientoService
) {

    @PostMapping
    fun create(@RequestBody tipoDeMovimiento: TipoDeMovimiento): ResponseEntity<TipoDeMovimiento> {
        val created = tipoDeMovimientoService.create(tipoDeMovimiento)
        return ResponseEntity(created, HttpStatus.CREATED)
    }

    @GetMapping
    fun getAll(): ResponseEntity<List<TipoDeMovimiento>> {
        return ResponseEntity(tipoDeMovimientoService.getAll(), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): ResponseEntity<TipoDeMovimiento> {
        val result = tipoDeMovimientoService.getById(id)
        return if (result.isPresent) {
            ResponseEntity(result.get(), HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody tipoDeMovimiento: TipoDeMovimiento): ResponseEntity<TipoDeMovimiento> {
        val updated = tipoDeMovimientoService.update(id, tipoDeMovimiento)
        return ResponseEntity(updated, HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): ResponseEntity<Void> {
        tipoDeMovimientoService.delete(id)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}
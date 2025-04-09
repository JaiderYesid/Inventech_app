package com.inventech.Inventech.controller

import com.inventech.Inventech.model.Empleado
import com.inventech.Inventech.service.EmpleadoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/empleados")
@CrossOrigin("*")
class EmpleadoController(private val service: EmpleadoService) {

    @GetMapping
    fun listar(): List<Empleado> = service.listar()

    @GetMapping("/{id}")
    fun obtener(@PathVariable id: Long): Empleado? = service.obtenerPorId(id)

    @PostMapping
    fun crear(@RequestBody empleado: Empleado): Empleado = service.guardar(empleado)

    @PutMapping("/{id}")
    fun actualizar(@PathVariable id: Long, @RequestBody empleado: Empleado): Empleado {
        val empleadoExistente = service.obtenerPorId(id) ?: throw Exception("Empleado no encontrado")
        val actualizado = empleadoExistente.copy(
            nombre = empleado.nombre,
            correo = empleado.correo,
            rol = empleado.rol,
            telefono = empleado.telefono
        )
        return service.guardar(actualizado)
    }

    @DeleteMapping("/{id}")
    fun eliminar(@PathVariable id: Long) = service.eliminar(id)
}

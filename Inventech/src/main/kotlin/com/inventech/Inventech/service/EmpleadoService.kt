package com.inventech.Inventech.service

import com.inventech.Inventech.model.Empleado
import com.inventech.Inventech.repository.EmpleadoRepository
import org.springframework.stereotype.Service

@Service
class EmpleadoService(private val repository: EmpleadoRepository) {

    fun listar(): List<Empleado> = repository.findAll()

    fun obtenerPorId(id: Long): Empleado? = repository.findById(id).orElse(null)

    fun guardar(empleado: Empleado): Empleado = repository.save(empleado)

    fun eliminar(id: Long) = repository.deleteById(id)
}

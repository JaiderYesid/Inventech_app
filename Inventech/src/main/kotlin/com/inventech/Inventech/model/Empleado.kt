package com.inventech.Inventech.model

import jakarta.persistence.*

@Entity
@Table(name = "empleados")
data class Empleado(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    var nombre: String,
    var correo: String,
    var rol: String,
    var telefono: String
)

package com.inventech.Inventech.model

import jakarta.persistence.*

@Entity
@Table(name = "inventario")
data class Inventario(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val registros: String,
    val productos: String,
    val fecha: String,
    val registro: String
)

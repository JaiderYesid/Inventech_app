package com.inventech.Inventech.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "ventas")
data class Venta(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val productoName: String,
    val cantidad: Int,
    val total: Double,
    val estado: String,
    val fecha: Date = Date()
)

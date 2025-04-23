package com.inventech.Inventech.model

import jakarta.persistence.*

@Entity
@Table(name = "TipoDeMovimiento")
data class TipoDeMovimiento(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val Descripcion : String,

    @ManyToOne
    @JoinColumn(name = "inventario_id", nullable = false)
    val inventario: Inventario
)

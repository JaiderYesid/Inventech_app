package com.inventech.Inventech.model

import jakarta.persistence.*

@Entity
@Table(name = "categoria")
data class Categoria(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val nombre: String,
    val descripcion: String

    @OneToMany(mappedBy = "Categoria", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    val productos: List<Producto> = emptyList()

)

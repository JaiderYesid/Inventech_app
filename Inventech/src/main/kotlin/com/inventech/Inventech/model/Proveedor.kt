package com.inventech.Inventech.model

import jakarta.persistence.*

@Entity
@Table(name = "proveedores")
data class Proveedor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val nombre: String,
    val telefono: String,
    val email: String
)


//package com.inventech.Inventech.model
//
//import jakarta.persistence.*
//
//@Entity
//data class Proveedor(
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    val id: Long = 0,
//    val nombre: String,
//    val contacto: String
//)
//

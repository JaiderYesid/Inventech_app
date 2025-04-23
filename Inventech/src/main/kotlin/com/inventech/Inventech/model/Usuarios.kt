//package com.inventech.Inventech.model
//
//import jakarta.persistence.*
//
//@Entity
//data class User(
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    val id: Long? = null,
//
//    val username: String,
//    val password: String,
//
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//        name = "user_roles",
//        joinColumns = [JoinColumn(name = "user_id")],
//        inverseJoinColumns = [JoinColumn(name = "role_id")]
//    )
//    val roles: Set<Role> = emptySet()
//)

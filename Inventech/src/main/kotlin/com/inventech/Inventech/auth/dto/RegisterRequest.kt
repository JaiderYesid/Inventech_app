package com.inventech.Inventech.auth.dto

import com.inventech.Inventech.model.Role

// <-- asegúrate que este paquete coincida con tu estructura

data class RegisterRequest(
    val username: String,
    val password: String,
    val role: Role
)

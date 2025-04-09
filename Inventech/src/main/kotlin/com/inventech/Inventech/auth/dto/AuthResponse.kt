package com.inventech.Inventech.auth.dto

import com.inventech.Inventech.model.Role

data class AuthResponse(
    val token: String,
    val role: String
)
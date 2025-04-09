package com.inventech.Inventech.auth.controller

import com.inventech.Inventech.auth.dto.AuthRequest
import com.inventech.Inventech.auth.dto.AuthResponse
import com.inventech.Inventech.auth.service.AuthService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import com.inventech.Inventech.auth.dto.RegisterRequest

@RestController
@RequestMapping("/api/auth")
class AuthController(
    private val authService: AuthService
) {
    @PostMapping("/register")
    fun register(@RequestBody request: RegisterRequest): ResponseEntity<String> {
        authService.register(request)
        return ResponseEntity.ok("Usuario registrado")
    }

    @PostMapping("/login")
    fun login(@RequestBody request: AuthRequest): ResponseEntity<AuthResponse> {
        val authResponse = authService.login(request)
        return ResponseEntity.ok(authResponse)
    }
}
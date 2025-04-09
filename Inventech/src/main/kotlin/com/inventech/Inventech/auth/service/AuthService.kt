package com.inventech.Inventech.auth.service

import com.inventech.Inventech.auth.dto.AuthRequest
import com.inventech.Inventech.auth.dto.AuthResponse
import com.inventech.Inventech.auth.dto.RegisterRequest
import com.inventech.Inventech.auth.jwt.JwtService
import com.inventech.Inventech.model.Role
import com.inventech.Inventech.model.User
import com.inventech.Inventech.repository.UserRepository
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class AuthService(
    private val authenticationManager: AuthenticationManager,
    private val jwtService: JwtService,
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
) {
    fun register(request: RegisterRequest) {
        val user = User(
            username = request.username,
            password = passwordEncoder.encode(request.password),
            role = request.role
        )
        userRepository.save(user)

        val token = jwtService.generateToken(user)
    }


    fun login(authRequest: AuthRequest): AuthResponse {
        authenticationManager.authenticate(
            UsernamePasswordAuthenticationToken(authRequest.username, authRequest.password)
        )

        val user = userRepository.findByUsername(authRequest.username)
            ?: throw UsernameNotFoundException("Usuario no encontrado")

        val token = jwtService.generateToken(user)

        return AuthResponse(token = token, role = user.role.name)
    }
}
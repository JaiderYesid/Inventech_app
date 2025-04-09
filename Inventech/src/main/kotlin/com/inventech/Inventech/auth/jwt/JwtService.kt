package com.inventech.Inventech.auth.jwt

import com.inventech.Inventech.model.User
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import io.jsonwebtoken.security.Keys
import org.springframework.stereotype.Service
import java.util.*

@Service
class JwtService {
    private val key = Keys.secretKeyFor(SignatureAlgorithm.HS256)

    fun generateToken(user: User): String {
        return Jwts.builder()
            .setSubject(user.username)
            .claim("role", user.role)
            .setIssuedAt(Date())
            .setExpiration(Date(System.currentTimeMillis() + 3600000))
            .signWith(key)
            .compact()
    }

    fun validateToken(token: String): String? {
        return try {
            Jwts.parserBuilder().setSigningKey(key).build()
                .parseClaimsJws(token)
                .body.subject
        } catch (e: Exception) {
            null
        }
    }
}

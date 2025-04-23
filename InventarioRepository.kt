package com.inventech.Inventech.repository

import com.inventech.Inventech.model.Inventario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InventarioRepository : JpaRepository<Inventario, Long>

package com.inventech.Inventech.repository

import com.inventech.Inventech.model.TipoDeMovimiento
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TipoDeMovimientoRepository : JpaRepository<TipoDeMovimiento, Long>

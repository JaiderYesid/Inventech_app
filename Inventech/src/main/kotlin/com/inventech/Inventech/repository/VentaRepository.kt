package com.inventech.Inventech.repository

import com.inventech.Inventech.model.Venta
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VentaRepository : JpaRepository<Venta, Long>

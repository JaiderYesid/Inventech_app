package com.inventech.Inventech.service

import com.inventech.Inventech.model.TipoDeMovimiento
import com.inventech.Inventech.repository.TipoDeMovimientoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class TipoDeMovimientoService(
    @Autowired private val tipoMovimientoRepository: TipoDeMovimientoRepository
) {

    fun createTipoDeMovimiento(tipoMovimiento: TipoDeMovimiento): TipoDeMovimiento {
        return tipoMovimientoRepository.save(tipoMovimiento)
    }

    fun getAllTipoDeMovimientos(): List<TipoDeMovimiento> {
        return tipoMovimientoRepository.findAll()
    }

    fun getTipoDeMovimientoById(id: Long): Optional<TipoDeMovimiento> {
        return tipoMovimientoRepository.findById(id)
    }

    fun deleteTipoDeMovimiento(id: Long) {
        tipoMovimientoRepository.deleteById(id)
    }

    fun updateTipoDeMovimiento(id: Long, tipoMovimiento: TipoDeMovimiento): TipoDeMovimiento {
        return tipoMovimientoRepository.save(tipoMovimiento)
    }
}
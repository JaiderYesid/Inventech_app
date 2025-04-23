package com.inventech.Inventech.service

import com.inventech.Inventech.model.Categoria
import com.inventech.Inventech.model.Producto
import com.inventech.Inventech.repository.CategoriaRepository
import org.springframework.stereotype.Service

@Service
class CategoriaService(private val catRepository: CategoriaRepository) {

    fun getAllCategorias(): List<Categoria> = categoriaRepository.findAll()

    fun getCategoriaById(id: Long): Categoria? = categoriaRepository.findById(id).orElse(null)

    fun createCategoria(categoria: Categoria): Categoria = categoriaRepository.save(categoria)

    fun deleteCategoria(id: Long) = categoriaRepository.deleteById(id)

}

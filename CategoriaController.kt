package com.inventech.Inventech.controller

import com.inventech.Inventech.model.Categoria
import com.inventech.Inventech.service.CategoriaService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/categoria")
@CrossOrigin("*")
class CategoriaController(private val catservice: CategoriaService) {


    @GetMapping
    fun listar(): List<Categoria> = catservice.getAllCategorias()

    @GetMapping("/{id}")
    fun obtener(@PathVariable id: Long): Categoria? = catservice.getCategoriaById(id)

    @PostMapping
    fun crear(@RequestBody categoria: Categoria): Categoria = catservice.createCategoria(categoria)

    @PutMapping("/{id}")
    fun actualizar(@PathVariable id: Long, @RequestBody categoria: Categoria): Categoria {
        val categoriaExistente = service.getCategoriaById(id) ?: throw Exception("Categoría no encontrada")
        val actualizada = categoriaExistente.copy(
            nombre = categoria.nombre,
            descripcion = categoria.descripcion
        )
        return catservice.createCategoria(actualizada)
    }

    @DeleteMapping("/{id}")
    fun eliminar(@PathVariable id: Long) = catservice.deleteCategoria(id)
}
}

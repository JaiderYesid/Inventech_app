//package com.inventech.Inventech.service
//
//import com.inventech.Inventech.model.Cliente
//import com.inventech.Inventech.repository.ClienteRepository
//import org.springframework.stereotype.Service
//
//@Service
//class ClienteService(private val repo: ClienteRepository) {
//    fun listar(): List<Cliente> = repo.findAll()
//    fun guardar(cliente: Cliente): Cliente = repo.save(cliente)
//    fun buscar(id: Long): Cliente? = repo.findById(id).orElse(null)
//    fun eliminar(id: Long) = repo.deleteById(id)
//}

//package com.inventech.Inventech.controller
//
//import com.inventech.Inventech.model.Cliente
//import com.inventech.Inventech.service.ClienteService
//import org.springframework.web.bind.annotation.*
//
//@RestController
//@RequestMapping("/clientes")
//class ClienteController(private val service: ClienteService) {
//
//    @GetMapping
//    fun listar(): List<Cliente> = service.listar()
//
//    @PostMapping
//    fun guardar(@RequestBody cliente: Cliente): Cliente = service.guardar(cliente)
//
//    @GetMapping("/{id}")
//    fun buscar(@PathVariable id: Long): Cliente? = service.buscar(id)
//
//    @DeleteMapping("/{id}")
//    fun eliminar(@PathVariable id: Long) = service.eliminar(id)
//}

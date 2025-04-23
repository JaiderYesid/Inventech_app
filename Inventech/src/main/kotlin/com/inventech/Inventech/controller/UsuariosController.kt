//package com.inventech.Inventech.controller
//
//import com.inventech.Inventech.model.User
//import com.inventech.Inventech.service.UserService
//import org.springframework.web.bind.annotation.*
//
//@RestController
//@RequestMapping("/usuarios")
//class UsuarioController(val service: UserService) {
//
//    @GetMapping
//    fun listar() = service.listar()
//
//    @PostMapping
//    fun guardar(@RequestBody usuario: User) = service.guardar(usuario)
//
//    @GetMapping("/{id}")
//    fun obtener(@PathVariable id: Long) = service.buscar(id)
//
//    @DeleteMapping("/{id}")
//    fun eliminar(@PathVariable id: Long) = service.eliminar(id)
//}

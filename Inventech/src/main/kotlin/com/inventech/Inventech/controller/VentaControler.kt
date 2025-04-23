//package com.inventech.Inventech.controller
//
//import com.inventech.Inventech.model.Venta
//import com.inventech.Inventech.service.VentaService
//import org.springframework.web.bind.annotation.*
//
//@RestController
//@RequestMapping("/ventas")
//class VentaController(private val service: VentaService) {
//
//    @GetMapping
//    fun listar() = service.listar()
//
//    @PostMapping
//    fun guardar(@RequestBody venta: Venta) = service.guardar(venta)
//
//    @GetMapping("/{id}")
//    fun buscar(@PathVariable id: Long) = service.buscar(id)
//
//    @DeleteMapping("/{id}")
//    fun eliminar(@PathVariable id: Long) = service.eliminar(id)
//}

package com.inventech.Inventech.repository

import com.inventech.Inventech.model.Proveedor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProveedorRepository : JpaRepository<Proveedor, Long>


//package com.inventech.Inventech.repository
//
//import com.inventech.Inventech.model.Proveedor
//import org.springframework.data.jpa.repository.JpaRepository
//
//interface ProveedorRepository : JpaRepository<Proveedor, Long>

package com.example.SpringBase.controllers;


import com.example.SpringBase.entities.Proveedor;
import com.example.SpringBase.services.IProveedorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProveedorControlador {

@Autowired
private IProveedorServicio servicio;

@GetMapping("/api/proveedores")
public ArrayList<Proveedor> getTodos(){
  return servicio.getTodos();
}
@GetMapping("/api/proveedores/{id}")
public Proveedor getPorId(@PathVariable String id){
    return servicio.getPorId(Integer.parseInt(id));
}
@DeleteMapping("/api/proveedores/{id}")
public void eliminar(@PathVariable String id){
    servicio.eliminar(Integer.parseInt(id));
}

@PostMapping("/api/proveedores")
public void guardar(@RequestBody Proveedor provedor){
    servicio.guardar(provedor);
 }





















}

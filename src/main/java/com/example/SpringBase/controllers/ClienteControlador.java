package com.example.SpringBase.controllers;

import com.example.SpringBase.entities.Cliente;
import com.example.SpringBase.services.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
public class ClienteControlador {

@Autowired
private IClienteServicio servicio;


@GetMapping("/api/clientes")
public ArrayList<Cliente> getTodos(){
  return servicio.getTodos();
}


@GetMapping("/api/clientes/{id}")
public Cliente getPorId(@PathVariable String id){
  return servicio.getPorId(Integer.parseInt(id));
}



  @DeleteMapping("/api/clientes/{id}")
  public void eliminar(@PathVariable String id){
    servicio.eliminar(Integer.parseInt(id));
  }
  @PostMapping("/api/clientes")
  public void guardar(@RequestBody Cliente cliente){
    servicio.guardar(cliente);
  }


}

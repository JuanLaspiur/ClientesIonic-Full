package com.example.SpringBase.controllers;


import com.example.SpringBase.entities.Empleado;
import com.example.SpringBase.services.IEmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpleadoControlador {

@Autowired
private IEmpleadoServicio servicio;

@GetMapping("/api/empleados")
public ArrayList<Empleado> getTodos(){
 return servicio.getTodos();
}

@GetMapping("/api/empleados/{id}")
public Empleado getPorId(@PathVariable String id){
    return servicio.getPorId(Integer.parseInt(id));
}

@DeleteMapping("/api/empleados/{id}")
public void eliminar(@PathVariable String id){
 servicio.eliminar(Integer.parseInt(id));
}

 @PostMapping("/api/empleados")
  public void guardar(@RequestBody Empleado empleado){
   servicio.guardar(empleado);
}


}

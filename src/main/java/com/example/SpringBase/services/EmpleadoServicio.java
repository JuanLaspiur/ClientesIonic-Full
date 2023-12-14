package com.example.SpringBase.services;

import com.example.SpringBase.entities.Cliente;
import com.example.SpringBase.entities.Empleado;
import com.example.SpringBase.repository.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class EmpleadoServicio implements IEmpleadoServicio{
@Autowired
private EmpleadoRepositorio repositorio;

    @Override
    public ArrayList<Empleado> getTodos() {
        return (ArrayList<Empleado>) repositorio.findAll();
    }

    @Override
    public Empleado getPorId(int id) {
        return (Empleado)repositorio.findById(id).get();
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }

    @Override
    public void guardar(Empleado empleado) {
        repositorio.save(empleado);
    }
}

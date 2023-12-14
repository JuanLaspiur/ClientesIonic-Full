package com.example.SpringBase.services;

import com.example.SpringBase.entities.Proveedor;
import com.example.SpringBase.repository.ProveedorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ProveedorServicio implements IProveedorServicio{

 @Autowired
 private ProveedorRepositorio repositorio;

    @Override
    public ArrayList<Proveedor> getTodos() {
       return (ArrayList<Proveedor>) repositorio.findAll();
    }

    @Override
    public Proveedor getPorId(int id) {
        return (Proveedor)repositorio.findById(id).get();
    }

    @Override
    public void eliminar(int id) {
        repositorio.deleteById(id);
    }

    @Override
    public void guardar(Proveedor proveedor) {
        repositorio.save(proveedor);
    }
}

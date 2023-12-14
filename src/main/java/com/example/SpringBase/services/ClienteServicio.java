package com.example.SpringBase.services;

import com.example.SpringBase.entities.Cliente;
import com.example.SpringBase.repository.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Service
public class ClienteServicio implements IClienteServicio {
@Autowired
private ClienteRepositorio repositorio;

    public ArrayList<Cliente> getTodos(){
        return (ArrayList<Cliente>) repositorio.findAll();
    }

    @Override
    public Cliente getPorId(int id) {
        return (Cliente)repositorio.findById(id).get();
    }

    @Override
    public void eliminar(int id){
        repositorio.deleteById(id);
    }
@Override
    public void guardar(Cliente cliente){
        repositorio.save(cliente);
    }

}

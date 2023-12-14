package com.example.SpringBase.services;

import com.example.SpringBase.entities.Cliente;

import java.util.ArrayList;

public interface IClienteServicio {
    public ArrayList<Cliente> getTodos();
    public Cliente getPorId(int id);
    public void eliminar(int id);
    public void guardar(Cliente cliente);
}

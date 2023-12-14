package com.example.SpringBase.services;

import com.example.SpringBase.entities.Proveedor;


import java.util.ArrayList;

public interface IProveedorServicio {

    public ArrayList<Proveedor> getTodos();
    public Proveedor getPorId(int id);
    public void eliminar(int id);
    public void guardar(Proveedor proveedor);


}

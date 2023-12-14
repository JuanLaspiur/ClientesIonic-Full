package com.example.SpringBase.services;

import com.example.SpringBase.entities.Empleado;
import java.util.ArrayList;

public interface IEmpleadoServicio {

    public ArrayList<Empleado> getTodos();
    public Empleado getPorId(int id);
    public void eliminar(int id);
    public void guardar(Empleado Empleado);



}

package com.example.SpringBase.repository;

import com.example.SpringBase.entities.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends CrudRepository<Empleado, Integer> {
}

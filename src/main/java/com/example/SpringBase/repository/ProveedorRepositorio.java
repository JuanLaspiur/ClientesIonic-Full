package com.example.SpringBase.repository;

import com.example.SpringBase.entities.Proveedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepositorio extends CrudRepository<Proveedor, Integer> {
}

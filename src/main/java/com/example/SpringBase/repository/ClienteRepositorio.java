package com.example.SpringBase.repository;

import com.example.SpringBase.entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepositorio extends CrudRepository<Cliente, Integer>{

}


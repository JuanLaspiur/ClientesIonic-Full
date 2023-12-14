package com.example.SpringBase.entities;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Entity
@Table(name="proveedor")
@Getter @Setter @EqualsAndHashCode @ToString
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String mail;
    private String telefono;

}

package com.example.turismoapp.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")//Nombre de la tabla en la base de datos
public class Usuario {
    //ATRIBUTOS - VARIABLES DATOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String cedula;
    private Integer rol;
}

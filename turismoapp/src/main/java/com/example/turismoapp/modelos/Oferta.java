package com.example.turismoapp.modelos;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="ofertas")//Nombre de la tabla en la base de datos
public class Oferta {

    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = idempresa, nullable = false)
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;



}

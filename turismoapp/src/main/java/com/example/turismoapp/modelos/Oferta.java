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

    public Oferta(Integer id, String titulo, String descripcion, LocalDate fechaInicio, LocalDate fechaFin, Double costoPersona) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoPersona = costoPersona;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getCostoPersona() {
        return costoPersona;
    }

    public void setCostoPersona(Double costoPersona) {
        this.costoPersona = costoPersona;
    }
}

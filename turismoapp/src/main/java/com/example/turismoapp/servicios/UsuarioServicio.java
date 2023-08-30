package com.example.turismoapp.servicios;

import com.example.turismoapp.repositorios.OfertaRepositorio;
import com.example.turismoapp.repositorios.UsuarioRepositorio;
import com.example.turismoapp.validaciones.UsuarioValidaciones;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioServicio {
    @Autowired//Inyección es casi lo mismo de instancias
    UsuarioRepositorio objetoUsuarioRepositorio;

    @Autowired
    UsuarioValidaciones objetoUsuarioValidaciones;




}

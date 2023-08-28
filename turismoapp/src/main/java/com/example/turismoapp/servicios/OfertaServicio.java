package com.example.turismoapp.servicios;

import com.example.turismoapp.modelos.Empresa;
import com.example.turismoapp.modelos.Oferta;
import com.example.turismoapp.repositorios.EmpresaRepositorio;
import com.example.turismoapp.repositorios.OfertaRepositorio;
import com.example.turismoapp.validaciones.EmpresaValidaciones;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OfertaServicio {

    @Autowired
    OfertaRepositorio objetoOfertaRepositorio;


    public Oferta registrarOferta(Oferta datosARegistrar ) throws Exception{
        try{

            return (this.objetoOfertaRepositorio.save(datosARegistrar));
        }
        catch(Exception error)
        {
            throw new Exception(error.getMessage());

        }
    }

    public Oferta modificarOferta(Integer id, Oferta datosAModificar) throws Exception{
        return null;
    }

    public Oferta buscarOfertaPorId(Integer id) throws Exception {
        return null;
    }

    public List<Oferta> buscarOfertas() throws Exception{
        return null;
    }

    public Boolean eliminarOferta(Integer id) throws Exception {
        return true;
    }
}

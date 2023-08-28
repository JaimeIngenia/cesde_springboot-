package com.example.turismoapp.servicios;

import com.example.turismoapp.modelos.Empresa;
import com.example.turismoapp.repositorios.EmpresaRepositorio;
import com.example.turismoapp.validaciones.EmpresaValidaciones;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.util.List;

public class EmpresaServicio {
    @Autowired
    EmpresaRepositorio objetoEmpresaRepositorio;

    @Autowired
    EmpresaValidaciones objetoEmpresaValidaciones;


    public Empresa registrarEmpresa(Empresa datosARegistrar ) throws Exception{
        try{
            if( !(this.objetoEmpresaValidaciones.validarNombre(datosARegistrar.getNombre())) ){
                throw new Exception("Error falló el servicio");
            }
            //SI PASO TODOS LOS IF, LLAMO AL REPOSITORIO
            //this.objetoEmpresaRepositorio.save(datosARegistrar);
            //creacion del retorno
            return (this.objetoEmpresaRepositorio.save(datosARegistrar));
        }
        catch(Exception error)
        {
            throw new Exception(error.getMessage());

        }
    }

    public Empresa modificarEmpresa(Integer id, Empresa datosAModificar) throws Exception{
        return null;
    }

    public Empresa buscarEmpresaPorId(Integer id) throws Exception {
        return null;
    }

    public List<Empresa> buscarEmpresas() throws Exception{
        return null;
    }

    public Boolean eliminarEmpresa(Integer id) throws Exception {
        return true;
    }

}

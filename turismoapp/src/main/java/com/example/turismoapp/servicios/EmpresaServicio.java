package com.example.turismoapp.servicios;

import com.example.turismoapp.modelos.Empresa;
import com.example.turismoapp.repositorios.EmpresaRepositorio;
import com.example.turismoapp.validaciones.EmpresaValidaciones;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.util.List;
import java.util.Optional;

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
        try
        {   //Validamos la información
            if( !(this.objetoEmpresaValidaciones.validarNombre(datosAModificar.getNombre())) ){
                throw new Exception("Error en el dato entregado");
            }
            //buscar que la empresa que tiene el id que envia el usuario exista en BD
            Optional<Empresa> empresaEncontrada = this.objetoEmpresaRepositorio.findById(id);
            //Pregunto si lo que busque esta vacio significa que no existe

            if(empresaEncontrada.isEmpty()){
                throw new Exception("Empresa no encintrada");
            }
            //Rutina por si si la encontré
            //Convierto el opcional en la entidad respectiva
            Empresa empresaQueExiste = empresaEncontrada.get() ;

            //A la empresa que existe le cambio la información que el usuario necesita
            empresaQueExiste.setNombre(datosAModificar.getNombre());
            //3. guardar la información que se acaba de editar (SET)
            return this.objetoEmpresaRepositorio.save(empresaQueExiste);

        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public Empresa buscarEmpresaPorId(Integer id) throws Exception {
       try
       {
            Optional<Empresa> empresaOptional = this.objetoEmpresaRepositorio.findById(id);
            if(empresaOptional.isEmpty()){
                throw new Exception("Empresa no encontrada");
            }
            return  empresaOptional.get();
       }
       catch (Exception error)
       {
           throw new Exception(error.getMessage());
       }
    }

    public List<Empresa> buscarEmpresas() throws Exception{

        try
        {
            List<Empresa> listaEmpresa = this.objetoEmpresaRepositorio.findAll();
            return listaEmpresa;
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }

    }

    public Boolean eliminarEmpresa(Integer id) throws Exception {
        try
        {
            Optional<Empresa> empresaOptional = this.objetoEmpresaRepositorio.findById(id);

            if(empresaOptional.isPresent())
            {
                this.objetoEmpresaRepositorio.deleteById(id);
                return true;
            }
            else
            {
                throw new Exception("Empresa no encontrada");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

}

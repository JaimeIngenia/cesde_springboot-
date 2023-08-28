package com.example.turismoapp.servicios;

import com.example.turismoapp.modelos.Empresa;
import com.example.turismoapp.modelos.Oferta;
import com.example.turismoapp.repositorios.EmpresaRepositorio;
import com.example.turismoapp.repositorios.OfertaRepositorio;
import com.example.turismoapp.validaciones.EmpresaValidaciones;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

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
        try
        {   //Validamos la información
          /*  if( !(this.objetoOfertaRepositorio.validarNombre(datosAModificar.getNombre())) ){
                throw new Exception("Error en el dato entregado");
            }*/
            //buscar que la empresa que tiene el id que envia el usuario exista en BD
            Optional<Oferta> ofertaEncontrada = this.objetoOfertaRepositorio.findById(id);
            //Pregunto si lo que busque esta vacio significa que no existe

            if(ofertaEncontrada.isEmpty()){
                throw new Exception("Empresa no encintrada");
            }
            //Rutina por si si la encontré
            //Convierto el opcional en la entidad respectiva
            Oferta ofertaQueExiste = ofertaEncontrada.get() ;

            //A la empresa que existe le cambio la información que el usuario necesita
            ofertaQueExiste.setTitulo(datosAModificar.getTitulo());
            ofertaQueExiste.setDescripcion(datosAModificar.getDescripcion());
            //3. guardar la información que se acaba de editar (SET)
            return this.objetoOfertaRepositorio.save(ofertaQueExiste);

        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public Oferta buscarOfertaPorId(Integer id) throws Exception {
        try
        {
            Optional<Oferta> ofertaOptional = this.objetoOfertaRepositorio.findById(id);
            if(ofertaOptional.isEmpty()){
                throw new Exception("Oferta no encontrada");
            }
            return  ofertaOptional.get();
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public List<Oferta> buscarOfertas() throws Exception{
        try
        {
            List<Oferta> listaOferta = this.objetoOfertaRepositorio.findAll();
            return listaOferta;
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }

    public Boolean eliminarOferta(Integer id) throws Exception {
        try
        {
            Optional<Oferta> ofertaOptional = this.objetoOfertaRepositorio.findById(id);

            if(ofertaOptional.isPresent())
            {
                this.objetoOfertaRepositorio.deleteById(id);
                return true;
            }
            else
            {
                throw new Exception("Oferta no encontrada");
            }
        }
        catch (Exception error)
        {
            throw new Exception(error.getMessage());
        }
    }
}

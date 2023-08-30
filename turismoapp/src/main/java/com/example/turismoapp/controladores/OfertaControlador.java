package com.example.turismoapp.controladores;

import com.example.turismoapp.modelos.Empresa;
import com.example.turismoapp.modelos.Oferta;
import com.example.turismoapp.servicios.EmpresaServicio;
import com.example.turismoapp.servicios.OfertaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ofertas")
public class OfertaControlador {
    @Autowired
    OfertaServicio objetoOfertaServicio;

    //PRIMER METODO
    @PostMapping
    public ResponseEntity<?> registrarOferta(@RequestBody Oferta datosOferta){
        return null;
    }
    //SEGUNDO METODO
    @PutMapping
    public ResponseEntity<?> editaOferta( @RequestBody Oferta datosNuevosOferta, @PathVariable Integer idOferta ){
        return null;
    }

    //TERCER METODO
    @GetMapping
    public ResponseEntity<?> buscarUnaOferta( @PathVariable Integer idOferta ){
        return null;
    }

    //CUARTO METODO
    @GetMapping
    public ResponseEntity<?> buscarOfertas(){
        return null;
    }
    //QUINTO METODO
    @DeleteMapping
    public ResponseEntity<?> eliminarOfertas (@PathVariable Integer id){
        return null;
    }
}

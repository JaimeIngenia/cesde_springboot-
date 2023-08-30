package com.example.turismoapp.controladores;

import com.example.turismoapp.modelos.Empresa;
import com.example.turismoapp.servicios.EmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresas")
public class EmpresaControlador {

    @Autowired
    EmpresaServicio objetoEmpresaServicio;

    //PRIMER METODO
    @PostMapping
    public ResponseEntity<?> registrarEmpresa(@RequestBody Empresa datosEmpresa){
        return null;
    }
    //SEGUNDO METODO
    @PutMapping
    public ResponseEntity<?> editarEmpresa( @RequestBody Empresa datosNuevosEmpresa, @PathVariable Integer idEmpresa ){
        return null;
    }

    //TERCER METODO
    @GetMapping
    public ResponseEntity<?> buscarUnaEmpresa( @PathVariable Integer idEmpresa ){
        return null;
    }

    //CUARTO METODO
    @GetMapping
    public ResponseEntity<?> buscarEmpresas(){
        return null;
    }
    //QUINTO METODO
    @DeleteMapping
    public ResponseEntity<?> eliminarEmpresas (@PathVariable Integer id){
        return null;
    }
}

package com.example.turismoapp.validaciones;

import jdk.jshell.execution.Util;

public class EmpresaValidaciones {

    //private Util objetoUtil = new Util();

    public Boolean validarNombre ( String nombre ) throws Exception{


        if(nombre.length()>30){
            throw new Exception("Longitud de caracteres invalida");
        }
        else
        {
            return true;
        }
    }


}

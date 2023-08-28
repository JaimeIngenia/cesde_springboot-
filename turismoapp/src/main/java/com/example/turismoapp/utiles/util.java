package com.example.turismoapp.utiles;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class util {

    public Boolean buscarCoincidencias (String expresionRegular, String cadena){

        Pattern patronFuncion = Pattern.compile(expresionRegular);
        Matcher coincidenciaFuncion = patronFuncion.matcher(cadena);

        //return coincidenciaFuncion.matches();
        if(coincidenciaFuncion.matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

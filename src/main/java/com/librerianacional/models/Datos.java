package com.librerianacional.models;

import com.librerianacional.utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Datos {

    private static ArrayList<Map<String, String>> datos= new ArrayList<>();

    public static ArrayList<Map<String, String>> data(){

        try {
            datos = Excel.leerDatosDeHojaDeExcel("src/test/resources/datos/datos.xlsx", "busqueda");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return datos;
    }
}

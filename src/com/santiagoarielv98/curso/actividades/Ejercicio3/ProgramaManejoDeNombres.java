package com.santiagoarielv98.curso.actividades.Ejercicio3;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombre1 = args[0];
        String nombre2 = args[1];
        String nombre3 = args[2];

        String nombre1Modificado = nombre1.substring(1, 2).toUpperCase() + "." + nombre1.substring(nombre1.length() - 2);
        String nombre2Modificado =
                nombre2.substring(1, 2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length() - 2));
        String nombre3Modificado = nombre3.substring(1, 2).toUpperCase() + "." + nombre3.substring(nombre3.length() - 2);

        System.out.println(nombre1Modificado + "_" + nombre2Modificado + "_" + nombre3Modificado);
    }

}

package com.santiagoarielv98.curso.e23proyectoVerduleria;

public class Main {
    public static void main(String[] args) {
        Producto[] listaProducto = {
            new Lacteo("Leche Entera",61.79,12 ,7),
            new Lacteo("Leche Entera", 2.96,10,3),
            new Fruta("Manzana",18.62,4.7,"verde"),
            new Fruta("Berenjena",89.79,4.11,"Morado"),
            new Limpieza("Limpiador multiusos",87.81,"Químico B",1.42),
            new Limpieza("Limpiador multiusos",13.86,"Natural",2.26),
            new NoPerecible("NO",7.74,311,252),
            new NoPerecible("NO",33.82,264,221),
        };


        for (Producto producto: listaProducto){
            System.out.println(producto);
        }



    }
}

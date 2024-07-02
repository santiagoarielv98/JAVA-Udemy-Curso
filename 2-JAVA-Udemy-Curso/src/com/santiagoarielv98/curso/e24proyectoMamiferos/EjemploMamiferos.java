package com.santiagoarielv98.curso.e24proyectoMamiferos;

import com.santiagoarielv98.curso.e24proyectoMamiferos.felinos.*;
import com.santiagoarielv98.curso.e24proyectoMamiferos.caninos.*;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        Leon leon = new Leon("Sabana", 1.2, 2.5, 200, "Panthera leo", 0.5, 80, 5, 120);
        Tigre tigre = new Tigre("Selva", 1.1, 2.3, 180, "Panthera tigris", 0.4, 70, "Panthera tigris tigris");
        Guepardo guepardo = new Guepardo("Sabana", 1.1, 2.4, 150, "Acinonyx jubatus", 0.3, 120);
        Lobo lobo = new Lobo("Bosque", 1.0, 2.0, 100, "Canis lupus", "Gris", 0.2, 5, "Canis lupus");
        Perro perro = new Perro("Doméstico", 0.5, 0.7, 30, "Canis lupus familiaris", "Marrón", 0.02, 200);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

        for (Mamifero mamifero : mamiferos) {
            System.out.println(mamifero);
            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());
            System.out.println();
        }
    }
}

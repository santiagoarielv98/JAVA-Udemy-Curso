package com.santiagoarielv98.curso.e28HiloAlfanumerico;

public class EjemploHiloAlfanumerico {
    public static void main(String[] args) {
        Thread tarea1 = new Thread(new AlfanumericoTarea(Tipo.NUMERO));
        Thread tarea2 = new Thread(new AlfanumericoTarea(Tipo.LETRA));

        tarea1.start();
        tarea2.start();
    }
}

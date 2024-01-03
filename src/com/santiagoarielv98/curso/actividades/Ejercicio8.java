package com.santiagoarielv98.curso.actividades;

import java.util.Scanner;

public class Ejercicio8 {
    /*
    Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
*/

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double nota, promedioTotal = 0, promedioMayor5 = 0, promedioMenor4 = 0;
        int cantidadNotas1 = 0, cantidadNotasMayor5 = 0, cantidadNotasMenor4 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese nota: ");
            nota = keyboard.nextDouble();

            if (nota == 1) {
                cantidadNotas1++;
            } else if (nota > 5) {
                promedioMayor5 += nota;
                cantidadNotasMayor5++;
            } else if (nota < 4) {
                promedioMenor4 += nota;
                cantidadNotasMenor4++;
            }

            promedioTotal += nota;
        }

        promedioTotal /= 20;
        promedioMayor5 /= cantidadNotasMayor5;
        promedioMenor4 /= cantidadNotasMenor4;

        System.out.println("Promedio total: " + promedioTotal);
        System.out.println("Promedio notas mayor a 5: " + promedioMayor5);
        System.out.println("Promedio notas menor a 4: " + promedioMenor4);
        System.out.println("Cantidad notas 1: " + cantidadNotas1);
    }
}

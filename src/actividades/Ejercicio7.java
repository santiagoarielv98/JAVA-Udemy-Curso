package actividades;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadNumeros;
        int numero;
        int numeroMenor = 0;

        System.out.print("Ingrese la cantidad de números a comparar: ");
        cantidadNumeros = scanner.nextInt();

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (i == 0) {
                numeroMenor = numero;
            } else {
                if (numero < numeroMenor) {
                    numeroMenor = numero;
                }
            }
        }

        System.out.println("El número menor es: " + numeroMenor);

        if (numeroMenor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }
    }
}

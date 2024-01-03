package actividades;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese tamaño de la matriz: ");
        int tamanio = scanner.nextInt();

        char[][] matriz = new char[tamanio][tamanio];

        if(tamanio == 0){
            System.out.println("ERROR");
            System.exit(1);
        }

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if(i == j || i + j == tamanio - 1){
                    matriz[i][j] = 'X';
                }else{
                    matriz[i][j] = '_';
                }
            }
        }

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


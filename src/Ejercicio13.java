import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
        }

        for(int i = 0; i < numeros.length/2; i++){
            System.out.println(numeros[numeros.length - i - 1]+ " "+ numeros[i]);
        }

    }
}

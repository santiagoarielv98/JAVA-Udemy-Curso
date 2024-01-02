import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplicacion = 0;

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        for(int i = 0; i < num2; i++) {
            multiplicacion += num1;
        }

        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
    }

}

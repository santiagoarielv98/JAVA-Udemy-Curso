package actividades;

public class Ejercicio16 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};

        int cantidad = 0;
        int aux = 0;

        int ocurrencias = 0;
        int numero = 0;

        for (int j : numeros) {
            if (aux != j) {
                aux = j;
                cantidad = 0;
            }
            cantidad++;
            if (cantidad > ocurrencias) {
                ocurrencias = cantidad;
                numero = j;
            }
        }

        System.out.println("El número que más se repite es el " + numero + " con " + ocurrencias + " ocurrencias.");
    }
}

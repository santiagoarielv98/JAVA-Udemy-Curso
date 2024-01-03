package actividades;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[] numeros = {14, 33, 15, 36, 78, 21, 43};

        int numeroMayor = numeros[0];

        for(int numero: numeros){
            if(numero > numeroMayor){
                numeroMayor = numero;
            }
        }

        System.out.println("El número mayor es: " + numeroMayor);

    }
}

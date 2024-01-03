public class Ejercicio17
{
    public static void main(String[] args) {
        int[] numeros = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int[] histograma = new int[6];

        for (int numero : numeros) {
            histograma[numero - 1]++;
        }

        for (int i = 0; i < histograma.length; i++) {
            System.out.print((i + 1) + ": ");
            for(int j = 0; j < histograma[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

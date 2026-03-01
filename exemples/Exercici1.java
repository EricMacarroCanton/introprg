public class Exercici1 {


    public static void main(String[] args) {

        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int suma = sumaDiagonal(array2D);

        System.out.println("Suma diagonal: " + suma);
    }

    // Mòdul que retorni la suma de la diagonal principal
    public static int sumaDiagonal(int[][] array2D) {

        int suma = 0;

        for (int i = 0; i < array2D.length; i++) {
            suma += array2D[i][i];
        }

        return suma;
    }
}

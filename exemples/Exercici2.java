public class Exercici2 {

    public static void main(String[] args) {

        int[][] array = {
            {1, 3, 4, 5},
            {3, 5, 6, 7},
            {1, 6, 3, 4}
        };

        int[] newArray = getTotalPerRow(array);

        for (int f = 0; f < array.length; f++) {
            System.out.println(newArray[f]);
        }

        int maxim = getMax(array);
        System.out.println("Maxim suma fila: " + maxim);
    
        System.out.print("Introdueix el número multiplicador: ");
        int number = Integer.parseInt(Entrada.readLine());

        // Cridem el mòdul
        int[][] multipliedArray = multiplyArray(array, number);

        System.out.println("Array multiplicat:");

        for (int f = 0; f < multipliedArray.length; f++) {
            for (int c = 0; c < multipliedArray[f].length; c++) {
                System.out.print(multipliedArray[f][c] + " ");
            }
            System.out.println();
        }
    }  

    public static int[] getTotalPerRow(int[][] array) {

        int[] newArray = new int[array.length];

        for (int f = 0; f < array.length; f++) {

            int suma = 0;

            for (int c = 0; c < array[f].length; c++) {
                suma += array[f][c];
            }

            newArray[f] = suma;
        }

        return newArray;
    }

    public static int getMax(int[][] array) {

        int maxim = Integer.MIN_VALUE;

        for (int f = 0; f < array.length; f++) {

            int suma = 0;

            for (int c = 0; c < array[f].length; c++) {
                suma += array[f][c];
            }

            if (suma > maxim) {
                maxim = suma;
            }
        }

        return maxim;
    }

    // Mètode multiplyArray ara està dins de la classe
    public static int[][] multiplyArray(int[][] array, int number) {

        int[][] newArray = new int[array.length][array[0].length];

        for (int f = 0; f < array.length; f++) {
            for (int c = 0; c < array[f].length; c++) {
                newArray[f][c] = array[f][c] * number;
            }
        }

        return newArray;
    }
}

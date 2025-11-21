/**
 * Asteriscs.java
 * Mostra un triangle d'asteriscs segons el valor passat per línia de comandes.
 * */
 public class Asteriscs {
    public static void main(String[] args) {

       
        int n = Integer.parseInt(args[0]);

        for (int fila = 1; fila <= n; fila++) {
            for (int col = 1; col <= fila; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


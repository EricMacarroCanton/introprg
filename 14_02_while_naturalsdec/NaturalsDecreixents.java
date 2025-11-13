/*
 * Programa: NaturalsDecreixent
 * Descripció: El programa rep per línia de comandes un número enter
 *              i mostra tots els valors enters positius des d'aquest número fins a 1.
 *              Si el número és menor que 1, mostra un missatge
 *              indicant que no hi ha cap valor decreixent entre el número introduït i 1.
 *               mostrarà els números de 10 fins a 1
 * Autor: [Eric Macarro]
 */

public class NaturalsDecreixents {
    public static void main(String[] args) {
        

      

        int n = Integer.parseInt(args[0]);
        
            System.out.println("Has d'introduir un número com a argument.");
      
        if (n < 1) {
            System.out.println("Cap valor decreixent entre " + n + " i 1");
        } else {
            int i = n;
            while (i >= 1) {
                System.out.println(i);
                i--;
            }
        }
    }
}


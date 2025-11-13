
/*
 * Programa: Naturals
 * Descripció: El programa rep per línia de comandes un número enter
 *              i mostra tots els valors enters positius entre 1 i aquest número,
 *              ambdós inclosos. Si el número és menor que 1, mostra un missatge
 *              indicant que no hi ha cap valor creixent entre 1 i el número introduït.
 * Ús: java Naturals <número>
 * Exemple:
 *     java Naturals 10
 *     --> mostrarà els números de l’1 al 10
 * Autor: [Eric Macarro]
 */

public class Naturals {
public static void main (String [] args) {
        
      
        
           
        

        // Convertim l'argument a enter
        int n = Integer.parseInt(args[0]);

        
        if (n < 1) {
            System.out.println("Cap valor creixent entre 1 i " + n);
        } else {
            int i = 1;
            while (i <= n) {
                System.out.println(i);
                i++;
            }
        }
    }
}


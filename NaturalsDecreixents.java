/*
 * Programa: NaturalsDecreixents
 * Descripció: Rep un enter n i mostra tots els naturals des de n fins a 1.
 *             Si n < 1, informa que no hi ha valors decreixents entre n i 1.
 *             Utilitza un bucle for per generar la seqüència.
 * Autor: Eric Macarro
 */

public class NaturalsDecreixents {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        if (n < 1) {
            System.out.println("Cap valor decreixent entre " + n + " i 1");
        } else {
            for (int i = n; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }
}


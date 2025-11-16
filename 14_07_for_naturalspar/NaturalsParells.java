/*
 * Rep un nombre n per paràmetre.
 * Mostra tots els nombres parells entre 1 i n.
 * Si n < 1, mostra un missatge informatiu.
 * Si no hi ha cap parell, també ho indica.
 * Autor: Eric Macarro
 */

public class NaturalsParells {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n < 1) {
            System.out.println("El nombre ha de ser ≥ 1.");
        } else {
            boolean hiHaParells = false;

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    hiHaParells = true;
                }
            }

            if (!hiHaParells) {
                System.out.println("No hi ha cap nombre parell entre 1 i " + n);
            }
        }
    }
}


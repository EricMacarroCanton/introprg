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
            System.out.println("Cap valor parell creixent entre 1 i " + n);
        } else {
            boolean hiHaParells = false;

            for (int i = 2; i <= n; i += 2) { // recorrem només els parells
                System.out.println(i);
                hiHaParells = true;
            }

            // Només mostrem el missatge si n ≥ 2 i no s'ha trobat cap parell
            if (!hiHaParells && n >= 2) {
                System.out.println("No hi ha cap nombre parell entre 1 i " + n);
            }
        }
    }
}


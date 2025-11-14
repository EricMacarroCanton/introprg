/*
 * Rep un nombre n per paràmetre.
 * Mostra tots els nombres parells entre 1 i n.
 * Controla si no n’hi ha cap i ho indica.
 * Funciona només amb n ≥ 1; altrament mostra missatge informatiu.
 * Recorre els valors incrementant d’1 en 1.
 Eric Macarro
 */
public class NaturalsParells {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        boolean hiHaParells = false;
	int i = 1;
        // Mostrar els parells entre 1 i n
  while ( i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
                hiHaParells = true;
                i++;
              } else {
               i++;
                            }
        }

        // Si no n'hi ha cap
        if (n < 1) {
            System.out.println("Cap valor parell creixent entre 1 i " + n);
        }
    }
}


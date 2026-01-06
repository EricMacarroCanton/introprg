/*
 * Programa: NomesLletres
 *
 * Demana un text i mostra només les lletres separades per comes,
 * en l'ordre en què apareixen al text original.
 */
public class NomesLletres {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        filtraLletres(text);
    }

    // Mostra només les lletres del text separades per comes
    public static void filtraLletres(String text) {
        boolean primer = true; // per controlar la coma inicial

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                if (!primer) {
                    System.out.print(", ");
                }
                System.out.print(c);
                primer = false;
            }
        }

        System.out.println();
    }
}


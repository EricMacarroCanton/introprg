/*
 * Programa: TextReves
 *
 * Demana un text i el mostra amb els caràcters en ordre invers,
 * separats per comes.
 */
public class TextReves {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        mostraReves(text);
    }

    // Mostra el text en ordre invers amb comes
    public static void mostraReves(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}


/*
 * Programa: Parentitza
 *
 * Demana un text i mostra cada lletra entre parèntesis.
 * La resta de caràcters es mostren sense canvis.
 */
public class Parentitza {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        parentitza(text);
    }

    // Mostra el text amb les lletres entre parèntesis
    public static void parentitza(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                System.out.print("(" + c + ")");
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}


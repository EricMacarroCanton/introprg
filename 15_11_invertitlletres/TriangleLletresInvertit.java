/*
 * Programa: TriangleLletresInvertit
 *
 * Demana un text i dibuixa un triangle amb les lletres del text
 * en ordre invers, utilitzant mòduls.
 */
public class TriangleLletresInvertit {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        dibuixaTriangleInvertit(text);
    }

    // Dibuixa totes les línies del triangle invertit
    public static void dibuixaTriangleInvertit(String text) {
        for (int i = text.length(); i > 0; i--) {
            dibuixaLiniaInvertida(text, i);
        }
    }

    // Dibuixa una línia del triangle invertit
    public static void dibuixaLiniaInvertida(String text, int linia) {
        int llargada = text.length();

        for (int i = 0; i < linia; i++) {
            System.out.print(text.charAt(llargada - 1 - i));
            if (i < linia - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}


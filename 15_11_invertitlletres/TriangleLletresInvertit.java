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
        for (int i = 0; i < text.length(); i++) {
            dibuixaLiniaInvertida(text, i);
        }
    }

    // Dibuixa una línia del triangle invertit
    public static void dibuixaLiniaInvertida(String text, int linia) {
        int llargada = text.length();

        for (int i = linia; i < llargada; i++) {
            System.out.print(text.charAt(llargada - 1 - i));
            if (i < llargada - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}


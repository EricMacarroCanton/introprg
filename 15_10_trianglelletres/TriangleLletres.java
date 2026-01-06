/*
 * Programa: TriangleLletres
 *
 * Demana un text i dibuixa un triangle amb les seves lletres,
 * utilitzant mòduls per separar la lògica.
 */
public class TriangleLletres {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        dibuixaTriangle(text);
    }

    // Dibuixa totes les línies del triangle
    public static void dibuixaTriangle(String text) {
        for (int i = 1; i <= text.length(); i++) {
            dibuixaLinia(text, i);
        }
    }

    // Dibuixa una línia del triangle
    public static void dibuixaLinia(String text, int linia) {
        for (int i = 0; i < linia; i++) {
            System.out.print(text.charAt(i));
            if (i < linia - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}


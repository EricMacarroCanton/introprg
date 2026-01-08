/*
 * Programa: TriangleParaules
 *
 * Demana un text i construeix un triangle de paraules
 * sense utilitzar split().
 */
public class TriangleParaules {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        mostraTriangle(text);
    }

    // Mostra el triangle de paraules sense split
    public static void mostraTriangle(String text) {
        int llargada = text.length();

        for (int i = 0; i < llargada; i++) {


            for (int j = 0; j <= i; j++) {
                System.out.print(text.charAt(j));
            }


            if (i == llargada - 1 || text.charAt(i) == ' ') {
                System.out.println();
            }
        }
    }
}


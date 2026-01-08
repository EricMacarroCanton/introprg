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

    public static void mostraTriangle(String text) {
        int llargada = text.length();

        for (int i = 0; i < llargada; i++) {
            if (text.charAt(i) == ' ') {
                // imprimir fins abans de l'espai
                for (int j = 0; j < i; j++) {
                    System.out.print(text.charAt(j));
                }
                System.out.println();
            }
        }


        System.out.println(text);
    }
}


/* Desenvolupa un lloro que vagi acceptant frases i que vagi convertint les notes anglosaxones a notació llatina.

Perquè el teu programa passi totes les proves, caldrà que la teva solució inclogui la funció String tradueixCDo(String) que, donat un text amb possibles notes anglosaxones, retorni el text amb les notes reemplaçades per la seva versió llatina.*/

public class TraductorCDo {

    public static void main(String[] args) {

        System.out.println("Traductor de notació anglosaxona a llatina");
        System.out.println("Introdueix frases (buit per finalitzar)");

        while (true) {
            String text = Entrada.readLine(); // mantenim tal qual

            if (text.equals("")) { // entrada buida → finalitzar
                System.out.println("Fet");
                break;
            }

            System.out.println(tradueixCDo(text));
        }
    }

    public static String tradueixCDo(String text) {
        if (text == null) return null;

        String resultat = "";
        int i = 0;

        while (i < text.length()) {
            char c = text.charAt(i);

            // Pot ser nota anglosaxona?
            if (c >= 'A' && c <= 'G') {
                boolean potSerNota = true;

                // Comprovem caràcter anterior
                if (i > 0) {
                    char ant = text.charAt(i - 1);
                    if (Character.isLetterOrDigit(ant) || ant == '#') {
                        potSerNota = false;
                    }
                }

                if (potSerNota) {
                    int j = i + 1;
                    String modificador = "";
                    String octave = "";

                    // Modificador '#' o 'b'
                    if (j < text.length()) {
                        char next = text.charAt(j);
                        if (next == '#' && c != 'B' && c != 'E') {
                            modificador = "#";
                            j++;
                        } else if (next == 'b' && c != 'C' && c != 'F') {
                            modificador = "b";
                            j++;
                        }
                    }

                    // Octave 0-8
                    if (j < text.length()) {
                        char next = text.charAt(j);
                        if (next >= '0' && next <= '8') {
                            octave = "" + next;
                            j++;
                        }
                    }

                    // Comprovem caràcter posterior
                    if (j == text.length() || (!Character.isLetterOrDigit(text.charAt(j)) && text.charAt(j) != '#')) {
                        // Traducció directa amb if-else
                        String notaLlatina = "";
                        if (c == 'C') notaLlatina = "Do";
                        else if (c == 'D') notaLlatina = "> Re";
                        else if (c == 'E') notaLlatina = "> Mi";
                        else if (c == 'F') notaLlatina = "> Fa";
                        else if (c == 'G') notaLlatina = "> Sol";
                        else if (c == 'A') notaLlatina = "> La";
                        else if (c == 'B') notaLlatina = "> Si";

                        resultat += notaLlatina + modificador + octave;
                        i = j;
                        continue;
                    }
                }
            }

            // Si no és nota, només afegim el caràcter
            resultat += c;
            i++;
        }

        return resultat;
    }
}

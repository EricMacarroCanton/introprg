/*exercici que  desenvolupa un lloro anomenat LloroNormalitzador que, vagi demanant texts i mentre no rebi la cadena buida, els retorni normalitzats de la següent manera:

Les vocals catalanes amb accent apareixeran en la seva variant sense accent.

La ç apareixerà com a c.

Per simplicitat, no tindrem en compte l'el·la geminada*/
public class LloroNormalitzador {

    public static String transformaText(String text) {
        String resultat = "";
        int i = 0;

        while (i < text.length()) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                if (UtilString.esVocal(c)) {
                    resultat = resultat + Character.toLowerCase(c);
                } else {
                    resultat = resultat + Character.toUpperCase(c);
                }
                i++;

            } else if (Character.isDigit(c)) {
                String nombre = "";

                while (i < text.length() && Character.isDigit(text.charAt(i))) {
                    nombre = nombre + text.charAt(i);
                    i++;
                }

                resultat = resultat + "(" + nombre + ")";

            } else if (c == ' ' || c == '\t') {
                resultat = resultat + c;
                i++;

            } else {
                // altres caràcters ignorats
                i++;
            }
        }

        return resultat;
    }
}


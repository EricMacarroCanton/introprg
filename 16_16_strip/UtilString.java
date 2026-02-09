//Desenvolupa un lloro que vagi demanant texts fins trobar la cadena buida o en blanc. Per cada text que rebi, que no correspongui a la condició de finalització, el lloro mostrarà la versió normalitzada.
public class UtilString {

    public static String normalitzaBlancs(String text) {
        String resultat = "";
        boolean dinsText = false;
        boolean espaiPendent = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ' || c == '\t') {
                if (dinsText) {
                    espaiPendent = true; // no l'afegim encara
                }
            } else {
                if (espaiPendent) {
                    resultat = resultat + " ";
                    espaiPendent = false;
                }
                resultat = resultat + c;
                dinsText = true;
            }
        }

        return resultat;
    }
}

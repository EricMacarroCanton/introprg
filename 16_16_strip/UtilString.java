//Desenvolupa un lloro que vagi demanant texts fins trobar la cadena buida o en blanc. Per cada text que rebi, que no correspongui a la condició de finalització, el lloro mostrarà la versió normalitzada.
public class UtilString {

    public static String normalitzaBlancs(String text) {
        if (text == null) {
            return "";
        }

        text = text.strip();

        String resultat = "";
        boolean ultimEraEspai = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ' || c == '\t') {
                if (!ultimEraEspai) {
                    resultat += " ";
                    ultimEraEspai = true;
                }
            } else {
                resultat += c;
                ultimEraEspai = false;
            }
        }

        return resultat;
    }
}


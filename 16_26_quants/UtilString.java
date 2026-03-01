/* Els Strings de Java en la versió que fem servir en aquest curs, no ofereixen la utilitat count() que en altres llenguatges permet saber quants cops apareix un substring en un string.

Això no pot ser! Així que farem nosaltres una implementació d'aquesta funció.

La versió que implementarem tindrà les dues modalitats, estricte i flexible, que hem implementat en exercicis anterior. com ara aquest*/
public class UtilString {

    // Normalitza el text: minúscules + elimina accents
    public static String normalitzaText(String text) {
        if (text == null) return null;

        text = text.toLowerCase();

        String accents = "àáâäãèéêëìíîïòóôöõùúûüç";
        String senseAccents = "aaaaaeeeeiiiiooooouuuuc";

        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean trobat = false;

            for (int j = 0; j < accents.length(); j++) {
                if (c == accents.charAt(j)) {
                    resultat += senseAccents.charAt(j);
                    trobat = true;
                    break;
                }
            }

            if (!trobat) {
                resultat += c;
            }
        }

        return resultat;
    }

    // Normalitza espais: múltiples espais → 1 espai, elimina espais al principi i final
    public static String normalitzaBlancs(String text) {
        if (text == null) return null;

        String resultat = "";
        boolean anteriorEspai = false;

        // Saltar espais inicials
        int i = 0;
        while (i < text.length() && text.charAt(i) == ' ') i++;

        for (; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ') {
                if (!anteriorEspai) {
                    resultat += " ";
                    anteriorEspai = true;
                }
            } else {
                resultat += c;
                anteriorEspai = false;
            }
        }

        // Eliminar espai final si existeix
        if (resultat.length() > 0 && resultat.charAt(resultat.length() - 1) == ' ') {
            resultat = resultat.substring(0, resultat.length() - 1);
        }

        return resultat;
    }

    // Retorna true si substring és dins text
    public static boolean esSubstring(String substring, String text, boolean estricte) {
        if (substring == null || text == null) return false;

        if (!estricte) {
            text = normalitzaBlancs(text);
            substring = normalitzaBlancs(substring);

            text = normalitzaText(text);
            substring = normalitzaText(substring);
        }

        if (substring.length() > text.length()) return false;

        for (int i = 0; i <= text.length() - substring.length(); i++) {
            boolean coincideix = true;

            for (int j = 0; j < substring.length(); j++) {
                if (text.charAt(i + j) != substring.charAt(j)) {
                    coincideix = false;
                    break;
                }
            }

            if (coincideix) return true;
        }

        return false;
    }

    public static boolean esSubstring(String substring, String text) {
        return esSubstring(substring, text, true);
    }

    // ----------------------------
    // Funció quants() → compta aparicions
    public static int quants(String substring, String text, boolean estricte) {
        if (substring == null || text == null) return 0;

        if (substring.length() == 0) return -1; // cadena buida → infinit

        if (!estricte) {
            text = normalitzaBlancs(text);
            substring = normalitzaBlancs(substring);

            text = normalitzaText(text);
            substring = normalitzaText(substring);
        }

        int count = 0;

        for (int i = 0; i <= text.length() - substring.length(); i++) {
            boolean coincideix = true;

            for (int j = 0; j < substring.length(); j++) {
                if (text.charAt(i + j) != substring.charAt(j)) {
                    coincideix = false;
                    break;
                }
            }

            if (coincideix) count++;
        }

        return count;
    }

    public static int quants(String substring, String text) {
        return quants(substring, text, true);
    }
}

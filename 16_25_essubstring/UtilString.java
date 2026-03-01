//És una funció molt còmoda però té algunes limitacions ja hem adreçat a exercicis anteriors.
//De la mateixa manera que ja hem fet, per exemple, amb String.endsWith(), crearem una adaptació de contains() amb les següents signatures:
// UtilString.java
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
                    resultat = resultat + senseAccents.charAt(j);
                    trobat = true;
                    break;
                }
            }

            if (!trobat) {
                resultat = resultat + c;
            }
        }

        return resultat;
    }

    // Normalitza espais: múltiples espais → 1 espai, elimina espais al principi i final
    public static String normalitzaBlancs(String text) {
        if (text == null) return null;

        String resultat = "";
        boolean anteriorEspai = true;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c != ' ') {
                resultat = resultat + c;
                anteriorEspai = false;
            } else {
                if (!anteriorEspai) {
                    resultat = resultat + c;
                    anteriorEspai = true;
                }
            }
        }

        // eliminar espais inicials i finals
        int start = 0;
        while (start < resultat.length() && resultat.charAt(start) == ' ') start++;

        int end = resultat.length() - 1;
        while (end >= start && resultat.charAt(end) == ' ') end--;

        String finalResult = "";
        for (int i = start; i <= end; i++) finalResult = finalResult + resultat.charAt(i);

        return finalResult;
    }

    // Retorna true si substring és dins text
    public static boolean esSubstring(String substring, String text, boolean estricte) {
        if (substring == null || text == null) return false;

        if (!estricte) {
            text = normalitzaBlancs(text);
            substring = normalitzaBlancs(substring); // ✅ ara normalitzem també el substring

            text = normalitzaText(text);
            substring = normalitzaText(substring);

            // Bucle per comprovar substring normalitzat
            for (int i = 0; i <= text.length(); i++) {
                boolean coincideix = true;
                for (int j = 0; j < substring.length(); j++) {
                    if (i + j >= text.length() || text.charAt(i + j) != substring.charAt(j)) {
                        coincideix = false;
                        break;
                    }
                }
                if (coincideix) return true;
            }
            return false;
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
}

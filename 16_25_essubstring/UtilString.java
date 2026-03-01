//És una funció molt còmoda però té algunes limitacions ja hem adreçat a exercicis anteriors.
//De la mateixa manera que ja hem fet, per exemple, amb String.endsWith(), crearem una adaptació de contains() amb les següents signatures:
// UtilString.java
public class UtilString {

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

    // Normalitza espais: només converteix múltiples espais consecutius en un espai
    // No fa trim ni usa isWhitespace
    public static String normalitzaBlancs(String text) {
        if (text == null) return null;

        String resultat = "";
        boolean anteriorEspai = false;

        for (int i = 0; i < text.length(); i++) {
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

        return resultat; // sense trim
    }

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
}

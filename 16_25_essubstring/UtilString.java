//És una funció molt còmoda però té algunes limitacions ja hem adreçat a exercicis anteriors.
//De la mateixa manera que ja hem fet, per exemple, amb String.endsWith(), crearem una adaptació de contains() amb les següents signatures:
public class UtilString {

    public static String normalitzaText(String text) {
        if (text == null) return null;
        return text.toLowerCase();
    }

    public static String normalitzaBlancs(String text) {
        if (text == null) return null;

        String resultat = "";
        boolean anteriorEspai = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isWhitespace(c)) {
                if (!anteriorEspai) {
                    resultat += " ";
                    anteriorEspai = true;
                }
            } else {
                resultat += c;
                anteriorEspai = false;
            }
        }

        return resultat.trim();
    }

    public static boolean esSubstring(String substring, String text, boolean estricte) {

        if (substring == null || text == null) return false;

        text = normalitzaBlancs(text);
        substring = normalitzaBlancs(substring);

        if (!estricte) {
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

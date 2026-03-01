//És una funció molt còmoda però té algunes limitacions ja hem adreçat a exercicis anteriors.
//De la mateixa manera que ja hem fet, per exemple, amb String.endsWith(), crearem una adaptació de contains() amb les següents signatures:
public class UtilString {


    public static boolean esSubstring(String substring, String text, boolean estricte) {

        if (substring == null || text == null) {
            return false;
        }

        if (substring.length() > text.length()) {
            return false;
        }

        if (!estricte) {
            substring = substring.toLowerCase();
            text = text.toLowerCase();
        }

        for (int i = 0; i <= text.length() - substring.length(); i++) {

            boolean coincideix = true;

            for (int j = 0; j < substring.length(); j++) {

                if (text.charAt(i + j) != substring.charAt(j)) {
                    coincideix = false;
                    break;
                }
            }

            if (coincideix) {
                return true;
            }
        }

        return false;
    }

    // Sobrecàrrega (per defecte estricte)
    public static boolean esSubstring(String substring, String text) {
        return esSubstring(substring, text, true);
    }
}

//capçalera exercici 16_09 d'aqui es cridara la classe en nomeslletres
public class UtilString {

    // Retorna només les lletres del text, en el mateix ordre
    public static String nomesLletres(String text) {
        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                resultat += c;
            }
        }

        return resultat;
    }

    // Retorna les lletres separades per comes i espais
    public static String lletresSeparades(String text) {
        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            if (i > 0) {
                resultat += ", ";
            }
            resultat += text.charAt(i);
        }

        return resultat;
    }
}


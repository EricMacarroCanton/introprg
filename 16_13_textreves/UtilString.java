/*programa on  String inverteix(String): Retorna el text del revés

String cometeja(String): Separa cada caràcter que no sigui un espai en blanc amb una coma i un espai*/
public class UtilString {


    public static String inverteix(String text) {
        String resultat = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            resultat += text.charAt(i);
        }
        return resultat;
    }


    public static String cometeja(String text) {
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                if (!resultat.isEmpty()) {
                    resultat += ", ";
                }
                resultat += c;
            }
        }
        return resultat;
    }
}


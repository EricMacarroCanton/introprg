//Desenvolupa un programa anomenat ParaulesReves, que demani un text i el torni a mostrar però invertint l'ordre de les lletres dins de cada paraula. L'ordre de les paraules dins del text romandrà igual que a l'original.
public class ParaulesReves {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println(inverteixParaules(text));
    }

    // Inverteix cada paraula, mantenint els caràcters no lletres i l'ordre de les paraules
    public static String inverteixParaules(String text) {
        if (text == null) return null;

        String resultat = "";
        String paraula = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                paraula += c;
            } else {
                if (paraula.length() > 0) {
                    resultat += inverteixParaula(paraula);
                    paraula = "";
                }
                resultat += c;
            }
        }

        if (paraula.length() > 0) {
            resultat += inverteixParaula(paraula);
        }

        return resultat;
    }

    // Inverteix una paraula i ajusta la primera lletra segons el model
    public static String inverteixParaula(String paraula) {
        String invertida = "";
        for (int j = paraula.length() - 1; j >= 0; j--) {
            invertida += paraula.charAt(j);
        }
        // Ajusta només la primera lletra
        invertida = copiaCas(invertida, paraula);
        return invertida;
    }

    // Funció que les proves d'estructura esperen
    // Ajusta la primera lletra de 'text' al cas de la primera lletra de 'model'
    public static String copiaCas(String text, String model) {
        if (text.length() == 0 || model.length() == 0) return text;

        char c = text.charAt(0);
        char m = model.charAt(0);

        // Si el model té la primera lletra majúscula
        if ((m >= 'A' && m <= 'Z') || (m >= 'À' && m <= 'Þ')) {
            if ((c >= 'a' && c <= 'z') || (c >= 'à' && c <= 'ÿ')) {
                c = (char)(c - 32); // majúscula ASCII + accent
            }
        }
        // Si el model té la primera lletra minúscula
        else if ((m >= 'a' && m <= 'z') || (m >= 'à' && m <= 'ÿ')) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'À' && c <= 'Þ')) {
                c = (char)(c + 32); // minúscula ASCII + accent
            }
        }

        return c + text.substring(1); // la resta de la paraula no es toca
    }
}

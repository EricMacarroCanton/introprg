//Desenvolupa un programa anomenat ParaulesReves, que demani un text i el torni a mostrar però invertint l'ordre de les lletres dins de cada paraula. L'ordre de les paraules dins del text romandrà igual que a l'original.
public class ParaulesReves {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println(inverteixParaules(text));
    }

    // Inverteix les lletres de cada paraula mantenint l'ordre de paraules i caràcters no lletres
    public static String inverteixParaules(String text) {
        if (text == null) return null;

        String resultat = "";
        String paraula = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) { // detecta totes les lletres, incloent accents
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

    // Inverteix una sola paraula i ajusta la primera lletra segons el model
    public static String inverteixParaula(String paraula) {
        String invertida = "";
        for (int j = paraula.length() - 1; j >= 0; j--) {
            invertida += paraula.charAt(j);
        }
        invertida = copiaCas(invertida, paraula);
        return invertida;
    }

    // Ajusta la primera lletra de 'text' segons la primera lletra de 'model'
    public static String copiaCas(String text, String model) {
        if (text.length() == 0 || model.length() == 0) return text;

        char c = text.charAt(0);
        char m = model.charAt(0);

        // Ajust ASCII simple
        if (m >= 'A' && m <= 'Z') {
            if (c >= 'a' && c <= 'z') c = (char)(c - ('a' - 'A'));
        } else if (m >= 'a' && m <= 'z') {
            if (c >= 'A' && c <= 'Z') c = (char)(c + ('a' - 'A'));
        }

        return c + text.substring(1);
    }
}

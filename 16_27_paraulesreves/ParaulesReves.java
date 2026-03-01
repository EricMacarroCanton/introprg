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

            if (Character.isLetter(c)) {
                paraula += c;
            } else {
                if (paraula.length() > 0) {
                    String invertida = inverteixParaula(paraula);
                    resultat += invertida;
                    paraula = "";
                }
                resultat += c;
            }
        }

        if (paraula.length() > 0) {
            String invertida = inverteixParaula(paraula);
            resultat += invertida;
        }

        return resultat;
    }

    // Inverteix una paraula i ajusta el cas amb la funció pública copiaCas
    private static String inverteixParaula(String paraula) {
        String invertida = "";
        for (int j = paraula.length() - 1; j >= 0; j--) {
            invertida += paraula.charAt(j);
        }

        // Ajustem el cas de la primera lletra segons el model
        invertida = copiaCas(invertida, paraula);
        return invertida;
    }

    // Aquesta és la funció que les proves esperen!
    // Ajusta la primera lletra de 'text' segons la primera lletra de 'model'
    public static String copiaCas(String text, String model) {
        if (text.length() == 0 || model.length() == 0) return text;

        char c = text.charAt(0);
        char m = model.charAt(0);

        // ASCII simple: ajustem majúscula/minúscula
        if (m >= 'A' && m <= 'Z') {
            if (c >= 'a' && c <= 'z') {
                c = (char)(c - ('a' - 'A'));
            }
        } else if (m >= 'a' && m <= 'z') {
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + ('a' - 'A'));
            }
        }

        return c + text.substring(1);
    }
}

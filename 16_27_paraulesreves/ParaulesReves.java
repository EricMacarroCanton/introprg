//Desenvolupa un programa anomenat ParaulesReves, que demani un text i el torni a mostrar però invertint l'ordre de les lletres dins de cada paraula. L'ordre de les paraules dins del text romandrà igual que a l'original.
public class ParaulesReves {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println(inverteixParaules(text));
    }

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

    public static String inverteixParaula(String paraula) {
        String invertida = "";
        for (int j = paraula.length() - 1; j >= 0; j--) {
            invertida += paraula.charAt(j);
        }
        invertida = copiaCas(invertida, paraula);
        return invertida;
    }

    // Ajusta només la primera lletra al cas del model
    public static String copiaCas(String text, String model) {
        if (text.length() == 0 || model.length() == 0) return text;

        char c = text.charAt(0);
        char m = model.charAt(0);

        // si el caràcter és lletra, ajustem només la primera lletra
        if (Character.toUpperCase(m) == m && Character.toLowerCase(m) != m) {
            // primera lletra majúscula
            c = Character.toUpperCase(c);
        } else if (Character.toLowerCase(m) == m && Character.toUpperCase(m) != m) {
            // primera lletra minúscula
            c = Character.toLowerCase(c);
        }
        // la resta de lletres no es toquen
        return c + text.substring(1);
    }
}

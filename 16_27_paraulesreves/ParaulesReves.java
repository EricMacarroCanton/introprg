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
        // Ajusta només la primera lletra al cas de la primera lletra del model
        invertida = copiaCas(invertida, paraula);
        return invertida;
    }

    // Aquesta funció és la que les proves esperen
    // Ajusta la primera lletra de 'text' segons el cas de la primera lletra de 'model'
    public static String copiaCas(String text, String model) {
        if (text.length() == 0 || model.length() == 0) return text;

        char c = text.charAt(0);
        char m = model.charAt(0);

        // Si el model té la primera lletra majúscula
        if (Character.isUpperCase(m)) {
            c = Character.toUpperCase(c);
        }
        // Si el model té la primera lletra minúscula
        else if (Character.isLowerCase(m)) {
            c = Character.toLowerCase(c);
        }

        return c + text.substring(1); // la resta no es toca
    }
}

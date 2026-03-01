//Desenvolupa un programa anomenat ParaulesReves, que demani un text i el torni a mostrar però invertint l'ordre de les lletres dins de cada paraula. L'ordre de les paraules dins del text romandrà igual que a 
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
        // Invertim la paraula
        String invertida = "";
        for (int j = paraula.length() - 1; j >= 0; j--) {
            invertida += paraula.charAt(j);
        }
        // Ajustem només la primera lletra segons el model
        invertida = copiaCas(invertida, paraula);
        return invertida;
    }

    public static String copiaCas(String text, String model) {
        if (text.length() == 0 || model.length() == 0) return text;

        char c = text.charAt(0);
        char m = model.charAt(0);

        // Ajust segur de majúscula/minúscula amb Unicode
        if (Character.isUpperCase(m)) {
            c = Character.toUpperCase(c);
        } else {
            c = Character.toLowerCase(c);
        }

        return c + text.substring(1);
    }
}

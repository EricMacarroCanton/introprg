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
        boolean primeraParaula = true; // Flag per saber si és la primera paraula

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                paraula += c;
            } else {
                if (!paraula.isEmpty()) {
                    resultat += inverteixParaula(paraula, primeraParaula);
                    primeraParaula = false;
                    paraula = "";
                }
                resultat += c;
            }
        }

        // Invertim l'última paraula si n'hi ha
        if (!paraula.isEmpty()) {
            resultat += inverteixParaula(paraula, primeraParaula);
        }

        return resultat;
    }

    public static String inverteixParaula(String paraula, boolean primeraParaula) {
        String invertida = "";
        for (int j = paraula.length() - 1; j >= 0; j--) {
            invertida += paraula.charAt(j);
        }
        // Ajustem la primera lletra segons si és la primera paraula
        invertida = copiaCas(invertida, paraula, primeraParaula);
        return invertida;
    }

    // Ajusta només la primera lletra; la resta queda igual
    public static String copiaCas(String text, String model, boolean primeraParaula) {
        if (text.length() == 0) return text;

        char c = text.charAt(0);

        if (primeraParaula && Character.isUpperCase(model.charAt(0))) {
            c = Character.toUpperCase(c);
        } else {
            c = Character.toLowerCase(c);
        }

        return c + text.substring(1);
    }
}

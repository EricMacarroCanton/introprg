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
                    String invertida = "";
                    for (int j = paraula.length() - 1; j >= 0; j--) {
                        invertida += paraula.charAt(j);
                    }
                    invertida = copiaCas(invertida, paraula);
                    resultat += invertida;
                    paraula = "";
                }
                resultat += c;
            }
        }

        if (paraula.length() > 0) {
            String invertida = "";
            for (int j = paraula.length() - 1; j >= 0; j--) {
                invertida += paraula.charAt(j);
            }
            invertida = copiaCas(invertida, paraula);
            resultat += invertida;
        }

        return resultat;
    }

    // Copia majúscules i minúscules del model a text sense isUpperCase ni isLowerCase
   public static String copiaCas(String text, String model) {
    if (text == null || model == null) return text;

    String resultat = "";

    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);

        if (i < model.length()) {
            char m = model.charAt(i);

            // Si el model és una lletra, cal que el caràcter de text sigui el mateix cas
            if (Character.toLowerCase(c) == Character.toLowerCase(m)) {
                // mantenim exactament el cas del model
                c = m;
            } else {
                // si el model té una lletra diferent, ajustem només la primera lletra invertida
                // amb c = c (no canviem)
            }
        }
        resultat += c;
    }

    return resultat;
}
}

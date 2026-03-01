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

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                // acumulem la paraula
                paraula += c;
            } else {
                // quan trobem un caràcter que no és lletra, invertim la paraula acumulada
                if (paraula.length() > 0) {
                    String invertida = "";
                    for (int j = paraula.length() - 1; j >= 0; j--) {
                        invertida += paraula.charAt(j);
                    }
                    invertida = copiaCas(invertida, paraula);
                    resultat += invertida;
                    paraula = "";
                }
                resultat += c; // afegim el caràcter no lletra
            }
        }

        // Invertim l'última paraula si el text acaba amb lletra
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

    // Copia majúscules i minúscules del model a text
    public static String copiaCas(String text, String model) {
        if (text == null || model == null) return text;

        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (i < model.length()) {
                char m = model.charAt(i);

                if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                    if (m >= 'A' && m <= 'Z') {
                        // majúscula
                        if (c >= 'a' && c <= 'z') {
                            c = (char)(c - ('a' - 'A'));
                        }
                    } else if (m >= 'a' && m <= 'z') {
                        // minúscula
                        if (c >= 'A' && c <= 'Z') {
                            c = (char)(c + ('a' - 'A'));
                        }
                    }
                }
            }

            resultat += c;
        }

        return resultat;
    }
}

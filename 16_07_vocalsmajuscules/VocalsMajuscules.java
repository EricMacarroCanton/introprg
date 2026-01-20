public class VocalsMajuscules {

    public static void main(String[] args) {

        System.out.println("Text?");
        String text = Entrada.readLine();

        String resultat = majusculitzaVocals(text);
        System.out.println(resultat);
    }

    /**
     * Rep un text i retorna el mateix text amb les vocals minúscules en majúscules.
     */
    public static String majusculitzaVocals(String text) {

        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (esVocalMinuscula(c)) {
                resultat += Character.toUpperCase(c);
            } else {
                resultat += c;
            }
        }

        return resultat;
    }

    /**
     * Indica si un caràcter és una vocal minúscula.
     */
    public static boolean esVocalMinuscula(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}


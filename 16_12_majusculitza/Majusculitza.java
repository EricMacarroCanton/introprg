public class Majusculitza {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println(majusculitza(text));
    }

    public static String majusculitza(String text) {
        String resultat = "";
        boolean iniciParaula = true;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                if (iniciParaula) {
                    resultat += Character.toUpperCase(c);
                    iniciParaula = false;
                } else {
                    resultat += Character.toLowerCase(c);
                }
            } else {

                resultat += c;
                iniciParaula = true;
            }
        }

        return resultat;
    }
}


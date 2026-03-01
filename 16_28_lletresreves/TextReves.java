
public class TextReves {

    public static void main(String[] args) {
        System.out.println("Text?");

        String text = Entrada.readLine();
        System.out.println(inverteixLletres(text));

    }

    public static String inverteixLletres(String text) {
        if (text == null) return null;

        String resultat = "";
        int j = text.length() - 1; // punter dret

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

           if (Character.isLetter(c) || Character.isDigit(c)) {
                // busquem el següent caràcter vàlid des de la dreta
                while (!Character.isLetter(text.charAt(j)) && !Character.isDigit(text.charAt(j))) {
    j--;
}
                resultat += text.charAt(j);
                j--;
            } else {
                // no lletres ni dígits es mantenen
                resultat += c;
            }
        }

        return resultat;
    }
}

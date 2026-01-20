

public class VocalsMajuscules {

    public static void main(String[] args) {
    

        System.out.println("Text?");
        String text = Entrada.readLine();

        System.out.println(majusculitzaVocals(text));
    }

    public static String majusculitzaVocals(String text) {
        String textMinuscules = text.toLowerCase();
        String resultat = "";

        for (int i = 0; i < textMinuscules.length(); i++) {
            char c = textMinuscules.charAt(i);

            if (UtilString.esVocal(c)) {
                resultat += Character.toUpperCase(c);
            } else {
                resultat += c;
            }
        }

        return resultat;
    }
}


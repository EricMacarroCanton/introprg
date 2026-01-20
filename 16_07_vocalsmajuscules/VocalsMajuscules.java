//exercici on hem de posar totes les vocals catalane de un text en majuscules sense canviar les consonants
public class VocalsMajuscules {

    public static void main(String[] args) {
       

        System.out.println("Text?");
        String text = Entrada.readLine();

        // Normalització a minúscules 
        text = text.toLowerCase();

        System.out.println(majusculitzaVocals(text));
    }

    public static String majusculitzaVocals(String text) {
        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (UtilString.esVocal(c)) {
                resultat += Character.toUpperCase(c);
            } else {
                resultat += c;
            }
        }

        return resultat;
    }
}


public class LloroVocalIniciFi {

    public static void main(String[] args) {

        int comptador = 0;

        while (true) {
            System.out.println("Text?");
            String text = Entrada.readLine();

            // Si l'usuari no escriu res, sortim
            if (text.isEmpty()) {
             System.out.println("Sortir?");
                System.out.println("Adéu");
                break;
            }

            char primer = Character.toLowerCase(text.charAt(0));
            char ultim = Character.toLowerCase(text.charAt(text.length() - 1));

            if (UtilString.esVocal(primer) || UtilString.esVocal(ultim)) {
                comptador++;
                System.out.println("  " + comptador + ": \"" + text + "\"");
            }
        }
    }
}


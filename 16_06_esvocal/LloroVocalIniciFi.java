public class LloroVocalIniciFi {

    public static void main(String[] args) {

        int comptador = 0;

        while (true) {
            System.out.println("Text?");
            String text = Entrada.readLine();

            // Quan l'usuari introdueix línia buida → preguntar sortir
            if (text.isEmpty()) {
                System.out.println("Sortir?");
                String sortir = Entrada.readLine();
                System.out.println("Adéu");
                break;
            }

            char primer = text.charAt(0);
            char ultim = text.charAt(text.length() - 1);

            if (UtilString.esVocal(primer) || UtilString.esVocal(ultim)) {
                comptador++;
                System.out.println("  " + comptador + ": \"" + text + "\"");
            }
        }
    }
}


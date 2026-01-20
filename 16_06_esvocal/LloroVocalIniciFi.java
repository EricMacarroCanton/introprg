public class LloroVocalIniciFi {

    public static void main(String[] args) {

        int comptador = 0;

        while (true) {
            System.out.println("Text?");
            String text = Entrada.readLine();

            if (text.isEmpty()) {
                continue;
            }

            // Convertim NOMÉS els caràcters necessaris
            char primer = Character.toLowerCase(text.charAt(0));
            char ultim = Character.toLowerCase(text.charAt(text.length() - 1));

            if (UtilString.esVocal(primer) || UtilString.esVocal(ultim)) {
                comptador++;
                System.out.println(comptador + ": \"" + text + "\"");
            }

            System.out.println("Sortir?");
            String sortir = Entrada.readLine();

            if (UtilitatsConfirmacio.respostaABoolean(sortir)) {
                System.out.println("Adéu");
                break;
            }
        }
    }
}


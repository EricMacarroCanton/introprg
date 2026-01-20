public class LloroVocalIniciFi {

    public static void main(String[] args) {

        int comptador = 0;

        while (true) {
            System.out.println("Text?");
            String text = Entrada.readLine();

            // Només accedim a charAt si hi ha text
            if (!text.isEmpty()) {
                char primer = text.charAt(0);
                char ultim = text.charAt(text.length() - 1);

                if (UtilString.esVocal(primer) || UtilString.esVocal(ultim)) {
                    comptador++;
                    if (comptador < 10) {
                        System.out.println("  " + comptador + ": \"" + text + "\"");
                    } else {
                        System.out.println(" " + comptador + ": \"" + text + "\"");
                    }
                }
            }

            // Preguntar sortir sempre
            System.out.println("Sortir?");
            String sortir = Entrada.readLine();

            // Utilitzar la funció de confirmació
            if (UtilitatsConfirmacio.respostaABoolean(sortir)) {
                System.out.println("Adéu");
                break;
            }
        }
    }
}



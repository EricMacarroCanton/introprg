public class LloroVocalIniciFi {

    public static void main(String[] args) {

        int comptador = 0;
        boolean continuar = true;

        while (continuar) {
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

            // Preguntar Sortir? només després d’haver processat Text?
            System.out.println("Sortir?");
            String sortir = Entrada.readLine();

            // Si la resposta és afirmativa → acabem el bucle
            if (UtilitatsConfirmacio.respostaABoolean(sortir)) {
                System.out.println("Adéu");
                continuar = false; // no tornem a fer un nou Text?
            }
        }
    }
}



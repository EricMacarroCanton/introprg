public class LloroVocalIniciFi {

    public static void main(String[] args) {

        int comptador = 0;

        while (true) {
            System.out.println("Text?");
            String text = Entrada.readLine();

            char primer = 0;
            char ultim = 0;
            if (!text.isEmpty()) {
                primer = text.charAt(0);
                ultim = text.charAt(text.length() - 1);

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

            if (sortir.equals("s") || sortir.equals("si") || sortir.equals("sí")) {
                System.out.println("Adéu");
                break;
            }
        }
    }
}


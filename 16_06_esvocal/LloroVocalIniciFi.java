public class LloroVocalIniciFi {

    public static void main(String[] args) {

        int comptador = 0;

        while (true) {
            System.out.println("Text?");
            String text = Entrada.readLine();

            if (text.isEmpty()) {
                System.out.println("Sortir?");
                Entrada.readLine(); // llegim resposta del sortir
                System.out.println("Adéu");
                break;
            }

            char primer = text.charAt(0);
            char ultim = text.charAt(text.length() - 1);

            if (UtilString.esVocal(primer) || UtilString.esVocal(ultim)) {
                comptador++;
                // Ajustem espais segons la longitud del comptador
                if (comptador < 10) {
                    System.out.println("  " + comptador + ": \"" + text + "\"");
                } else {
                    System.out.println(" " + comptador + ": \"" + text + "\"");
                }
            }
        }
    }
}


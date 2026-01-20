public class LloroVocalIniciFi {

    public static void main(String[] args) {

        int comptador = 0;

        while (true) {
            System.out.println("Text?");
            String text = Entrada.readLine();

            char primer = Character.toLowerCase(text.charAt(0));
            char ultim = Character.toLowerCase(text.charAt(text.length() - 1));

            if (UtilString.esVocal(primer) || UtilString.esVocal(ultim)) {
                comptador++;
                //  DOS espais abans del número
                System.out.println("  " + comptador + ": \"" + text + "\"");
            }

            System.out.println("Text?");
            System.out.println("Sortir?");
            String sortir = Entrada.readLine();

            if (sortir.equals("s") || sortir.equals("sí") || sortir.equals("si")) {
                System.out.println("Adéu");
                break;
            }
        }
    }
}


public class LloroVocalIniciFi {

    public static void main(String[] args) {

        int comptador = 0;

        while (true) {
            System.out.println("Text?");
            String text = Entrada.readLine();

            if (text.isEmpty()) {
                System.out.println("Sortir?");
                String sortir = Entrada.readLine(); 
                   if (sortir.equals("s") || sortir.equals("si") || sortir.equals("sí")) {
                	System.out.println("Adéu");
                	break;
            }
            
            }

            char primer = text.charAt(0);
            char ultim = text.charAt(text.length() - 1);
   if (!text.isEmpty()) {
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
}


public class Enters {
    public static void main(String[] args) {

        System.out.println("Introdueix els texts a analitzar:");

        boolean seguit = true;

        while (seguit) {
            String text = Entrada.readLine();

            // Sortir amb línia buida
            if (text.length() == 0) {
                System.out.println("Adéu");
                seguit = false;
            } else {

                boolean esEnter = true;
                boolean nomesEspais = true;

                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);

                    // Si hi ha una lletra → NO és enter
                    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                        esEnter = false;
                    }

                    // Si trobem alguna cosa que no sigui espai
                    if (c != ' ') {
                        nomesEspais = false;
                    }
                }

                // Si és només espais → NO és enter
                if (nomesEspais) {
                    esEnter = false;
                }

                if (esEnter) {
                    System.out.println("\"" + text + "\" és enter");
                } else {
                    System.out.println("\"" + text + "\" no és enter");
                }
            }
        }
    }
}


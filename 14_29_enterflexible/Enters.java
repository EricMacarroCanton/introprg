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
                boolean signeTrobat = false;
                boolean digitTrobat = false;

                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);

                    // Comprovar si hi ha alguna cosa que no sigui espai
                    if (c != ' ') {
                        nomesEspais = false;
                    }

                    // Ignorar espais
                    if (c == ' ') {
                        continue;
                    }

                    // Signe només permès al principi i només un
                    if (c == '+' || c == '-') {
                        if (i != 0 || signeTrobat) {
                            esEnter = false;
                            break;
                        }
                        signeTrobat = true;
                        continue;
                    }

                    // Dígit
                    if (c >= '0' && c <= '9') {
                        digitTrobat = true;
                        continue;
                    }

                    // Qualsevol altra cosa → no és enter
                    esEnter = false;
                    break;
                }

                // Només espais o cap dígit → no és enter
                if (nomesEspais || !digitTrobat) {
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



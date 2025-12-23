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
                boolean digitTrobat = false;
                boolean signeTrobat = false;
                boolean haComencat = false;

                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);

                    // Espais abans de començar: OK
                    if (!haComencat && c == ' ') {
                        continue;
                    }

                    // Marquem que ja hem començat
                    haComencat = true;

                    // Signe: només un i abans de qualsevol dígit
                    if (c == '+' || c == '-') {
                        if (signeTrobat || digitTrobat) {
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

                    // Espais finals: permetre’ls
                    if (c == ' ') {
                        // però només si ja hi ha hagut algun dígit
                        for (int j = i; j < text.length(); j++) {
                            if (text.charAt(j) != ' ') {
                                esEnter = false;
                            }
                        }
                        break;
                    }

                    // Qualsevol altra cosa → no és enter
                    esEnter = false;
                    break;
                }

                // Ha de tenir almenys un dígit
                if (!digitTrobat) {
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


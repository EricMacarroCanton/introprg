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
                boolean signeTrobat = false;
                boolean digitTrobat = false;

                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);

                    // Ignorar espais i punts
                    if (c == ' ' || c == '.') {
                        continue;
                    }

                    // Signe opcional (només un i abans dels dígits)
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

                    // Qualsevol altra cosa invalida
                    esEnter = false;
                    break;
                }

                // Sense cap dígit no és enter
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


public class Enters {
    public static void main(String[] args) {

        System.out.println("Introdueix els texts a analitzar:");

        boolean seguit = true;

        while (seguit) {
            String text = Entrada.readLine();

            if (text.length() == 0) {
                System.out.println("Adéu");
                seguit = false;
            } else {

                boolean esEnter = true;
                boolean digitTrobat = false;
                boolean signeTrobat = false;
                boolean esperantDigit = true; // per controlar separadors

                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);

                    // Espais sempre ignorables
                    if (c == ' ') {
                        continue;
                    }

                    // Signe opcional
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
                        esperantDigit = false;
                        continue;
                    }

                    // Separadors permesos només ENTRE dígits
                    if (c == '.' || c == '_') {
                        if (esperantDigit || !digitTrobat) {
                            esEnter = false;
                            break;
                        }
                        esperantDigit = true;
                        continue;
                    }

                    // Qualsevol altre caràcter
                    esEnter = false;
                    break;
                }

                // No pot acabar esperant un dígit ni sense cap dígit
                if (!digitTrobat || esperantDigit) {
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


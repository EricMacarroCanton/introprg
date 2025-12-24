// programa on hem de desenvolupar una nova versió del programa anterior enters estrictes. En aquesta ocasió implementarem una interpretació més flexible dels enters.
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
                boolean continuar = true;

                for (int i = 0; i < text.length() && continuar; i++) {
                    char c = text.charAt(i);

                    if (c == ' ') {
                        // no fem res
                    } else if (c == '+' || c == '-') {
                        if (signeTrobat || digitTrobat) {
                            esEnter = false;
                            continuar = false;
                        } else {
                            signeTrobat = true;
                        }
                    } else if (c >= '0' && c <= '9') {
                        digitTrobat = true;
                        esperantDigit = false;
                    } else if (c == '.' || c == '_') {
                        if (esperantDigit || !digitTrobat) {
                            esEnter = false;
                            continuar = false;
                        } else {
                            esperantDigit = true;
                        }
                    } else {
                        esEnter = false;
                        continuar = false;
                    }
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


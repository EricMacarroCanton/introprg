public class EnterFlexible {
    public static void main(String[] args) {

        System.out.println("Introdueix els texts a analitzar:");

        boolean seguit = true;

        while (seguit) {
            String enter = Entrada.readLine();

            // Si només prem Enter → acabar
            if (enter.length() == 0) {
                System.out.println("Adéu");
                seguit = false;
            } else {
                boolean esEnter = true;
                int start = 0;
                int len = enter.length();

                // Saltar espais inicials
                while (start < len && enter.charAt(start) == ' ') {
                    start++;
                }

                // Saltar espais finals per comprovar
                int end = len - 1;
                while (end >= start && enter.charAt(end) == ' ') {
                    end--;
                }

                if (start > end) {
                    esEnter = false; // només hi havia espais
                } else {
                    // Comprovar signe inicial
                    if (enter.charAt(start) == '+' || enter.charAt(start) == '-') {
                        if (start == end) {
                            esEnter = false; // només signe
                        } else {
                            start++;
                        }
                    }

                    // Recorregut dels caràcters restants
                    for (int i = start; i <= end; i++) {
                        char c = enter.charAt(i);
                        if (!(Character.isDigit(c) || c == '.' || c == '_')) {
                            esEnter = false;
                        }
                    }
                }

                // Mostrar resultat amb cometes
                if (esEnter) {
                    System.out.println("\"" + enter + "\" és enter");
                } else {
                    System.out.println("\"" + enter + "\" no és enter");
                }
            }
        }
    }
}



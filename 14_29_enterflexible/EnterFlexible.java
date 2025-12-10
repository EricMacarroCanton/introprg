public class Enter {
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

                // Comprovar si només hi ha espais
                boolean nomesEspais = true;
                for (int i = 0; i < enter.length(); i++) {
                    if (enter.charAt(i) != ' ') {
                        nomesEspais = false;
                    }
                }

                if (nomesEspais) {
                    esEnter = false;
                }

                // Comprovar signe inicial
                if (esEnter && (enter.startsWith("-") || enter.startsWith("+"))) {
                    if (enter.length() == 1) {
                        esEnter = false;
                    } else {
                        start = 1;
                    }
                }

                // Recorregut sense break
                for (int i = start; i < enter.length(); i++) {
                    esEnter = esEnter && Character.isDigit(enter.charAt(i));
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


public class Enters {
    public static void main(String[] args) {

        boolean seguit = true;

        while (seguit) {
            System.out.println("Introdueix els texts a analitzar:");
            String enter = Entrada.readLine();

            // Si només prem Enter → sortir
            if (enter.length() == 0) {
                System.out.println("Adéu");
                seguit = false;  // finalitzar bucle
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

                // Mostrar resultat
                if (esEnter) {
                    System.out.println("→ " + enter + " és enter");
                } else {
                    System.out.println("→ " + enter + " no és enter");
                }
            }
        }
    }
}



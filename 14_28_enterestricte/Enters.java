public class Enters {
    public static void main(String[] args) {

        System.out.println("Introdueix els texts a analitzar:");
        String enter = Entrada.readLine();

        boolean esEnter = true;
        int start = 0;

        // 1. Comprovar si només hi ha espais o està buit
        boolean nomesEspais = true;
        for (int i = 0; i < enter.length(); i++) {
            if (enter.charAt(i) != ' ') {
                nomesEspais = false;
            }
        }

        if (enter.length() == 0 || nomesEspais) {
            esEnter = false;
        }

        // 2. Comprovar signe inicial (només si encara és vàlid)
        if (esEnter && (enter.startsWith("-") || enter.startsWith("+"))) {
            if (enter.length() == 1) {
                esEnter = false; // Només hi ha el signe
            } else {
                start = 1;
            }
        }

        // 3. Recorregut sense break
        for (int i = start; i < enter.length(); i++) {
            char c = enter.charAt(i);

            // Només és vàlid si és dígit
            esEnter = esEnter && Character.isDigit(c);
        }

        // 4. Resultat
        if (esEnter) {
            System.out.println("→ " + enter + " és enter");
        } else {
            System.out.println("→ " + enter + " no és enter");
        }
    }
}


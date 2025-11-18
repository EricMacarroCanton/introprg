/*
Aquest programa mostra un interval de lletres començant des d'una inicial
i mostrant la quantitat indicada per l'usuari.
*/
public class LletresInterval {
    public static void main(String[] args) {

        System.out.println("lletra?");
        String liniaEntrada = Entrada.readLine();

        if (liniaEntrada.length() != 1) {
            System.out.println("ERROR: cal introduir només una lletra.");

        } else {

            char car = liniaEntrada.charAt(0);

            
            boolean minus = car >= 'a' && car <= 'z';
            boolean majus = car >= 'A' && car <= 'Z';

            if (!minus && !majus) {
                System.out.println("ERROR: '" + car + "' no és una lletra vàlida.");

            } else {

                System.out.println("quantes?");
                int total = Integer.parseInt(Entrada.readLine());

        
                if (total < 1) {
                    System.out.println("ERROR: cal indicar almenys 1");

                } else {

                    // Mostrem les lletres
                    for (int i = 0; i < total; i++) {
                        char lletraActual = (char)(car + i);

                        if (minus) {
                            lletraActual = (char)('a' + (lletraActual - 'a') % 26);
                        }
                        if (majus) {
                            lletraActual = (char)('A' + (lletraActual - 'A') % 26);
                        }
                        System.out.print(lletraActual);
                    }
                    System.out.println();
                }
            }
        }
    }
}



/*
En aquest exercici crearem un programa que demanarà la lletra inicial i quantes lletres ha de mostrar.
*/
public class LletresInterval {
    public static void main(String[] args) {

        System.out.println("lletra?");
        String linia = Entrada.readLine();

    
        if (linia.length() != 1) {
            System.out.println("ERROR: cal especificar una única lletra.");

        } else {

            char caracter = linia.charAt(0);

            boolean minuscula = caracter >= 'a' && caracter <= 'z';
            boolean majuscula = caracter >= 'A' && caracter <= 'Z';

            if (!minuscula && !majuscula) {
                System.out.println("ERROR: '" + caracter + "' no és una lletra vàlida.");

            } else {

                System.out.println("quantes?");
                int quant = Integer.parseInt(Entrada.readLine());

              
                if (quant < 1) {
                    System.out.println("ERROR: una com a mínim");

                } else {

             
                    for (int i = 0; i < quant; i++) {
                        char actual = (char)(caracter + i);

                        if (minuscula) {
                            actual = (char)('a' + (actual - 'a') % 26);
                        }

                        if (majuscula) {
                            actual = (char)('A' + (actual - 'A') % 26);
                        }
                        System.out.print(actual);
                    }
                    System.out.println("");
                }
            }
        }
    }
}




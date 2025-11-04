/**
 * Programa Lloro
 * Demana paraules a l'usuari i les repeteix fins que s'introdueix una línia buida o amb espais.
 * Quan passa això, mostra "Adéu" i acaba el programa.
 * [Eric Macarro]
 */
public class Lloro {
    public static void main(String[] args) {
        
        String paraula;

        while (true) {
            System.out.println("El lloro espera paraula:");
            paraula = Entrada.readLine();

            // Comprovem si la cadena és buida o només conté espais
            if (paraula.isBlank()) {
                System.out.println("Adéu");
                break;
            }

            System.out.println("El lloro repeteix: " + paraula);
        }
    }
}


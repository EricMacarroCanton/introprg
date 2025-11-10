/**
 * Programa Lloro
 * Demana paraules a l'usuari i les repeteix fins que s'introdueix una línia buida o amb espais.
 * Quan passa això, mostra "Adéu" i acaba el programa.
 * [Eric Macarro]
 */
public class Lloro {
    public static void main(String[] args) {

        String paraula = ""; // inicialitzem per poder entrar al bucle

        // El bucle continua mentre la paraula NO sigui buida ni només espais
        while (!paraula.isBlank()) {
            System.out.println("El lloro espera paraula:");
            paraula = Entrada.readLine();

            if (!paraula.isBlank()) {
                System.out.println("El lloro repeteix: " + paraula);
            }
        }

        System.out.println("Adéu");
    }
}


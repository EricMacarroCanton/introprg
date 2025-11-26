/**
 * Programa Lloro
 * Demana paraules a l'usuari i les repeteix fins que s'introdueix una línia buida o amb espais.
 * Quan passa això, mostra "Adéu" i acaba el programa.
 * [Eric Macarro] 
 */
public class Lloro {
    public static void main(String[] args) {

        System.out.println("El lloro espera paraula:");
        String paraula = Entrada.readLine();

        while (!paraula.isBlank()) {
            System.out.println("El lloro repeteix: " + paraula);
            System.out.println("El lloro espera paraula:");
            paraula = Entrada.readLine();
        }

        System.out.println("Adéu");
    }
}


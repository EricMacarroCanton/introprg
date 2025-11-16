/* exercici on el usuari ha de posar numeros aleatoris fins adivinar el numero exacte
Eric Macarro */

public class EndevinaNombre {
    public static void main(String[] args) {
        int nombrePensat = Integer.parseInt(args[0]);
        int intent = -1; // valor inicial qualsevol

     

        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
        System.out.println("Introdueix un valor");

        String linia = Entrada.readLine();

        if (!linia.isEmpty()) {
            intent = Integer.parseInt(linia);
        }

        while (intent != nombrePensat && !linia.isEmpty()) {
            if (intent > 100) {
                System.out.println("Com a màxim 100");
            } else if (intent < 1) {
                System.out.println("Com a mínim 1");
            } else if (intent > nombrePensat) {
                System.out.println("És més petit que " + intent);
            } else if (intent < nombrePensat) {
                System.out.println("És més gran que " + intent);
            }

            System.out.println("Introdueix un valor");
            linia = Entrada.readLine();

            if (!linia.isEmpty()) {
                intent = Integer.parseInt(linia);
            }
        }

        if (!linia.isEmpty()) {
            System.out.println("Has encertat!");
        } else {
            System.out.println("Cancel·lat!");
        }
    }
}


/**
 * Nom del programa: EndevinaNombre
 * 
 * Descripció:
 * Aquest programa és un joc d'endevinalles en què l'usuari ha d'introduir nombres enters
 * entre 1 i 100 fins que encerti el nombre que el programa "ha pensat". 
 * El programa indica si el nombre introduït és més gran o més petit que el nombre pensat,
 * i comprova també si l'entrada supera el valor màxim de 100.
 Autor:Eric Macarro
 **/
 public class EndevinaNombre {
    public static void main(String[] args) {
        int nombrePensat = Integer.parseInt(args[0]);
        int intent;


        System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");

        do {
            System.out.println("Introdueix un valor");
            intent = Integer.parseInt(Entrada.readLine());

            if (intent > 100) {
                System.out.println("Com a màxim 100");
            }  else if (intent < 1) {
                System.out.println("Com a mínim 1");
            } else if (intent > nombrePensat) {
                System.out.println("És més petit que " + intent);
            } else if (intent < nombrePensat) {
                System.out.println("És més gran que " + intent);
            }

        } while (intent != nombrePensat);

        System.out.println("Has encertat!");
    }
}


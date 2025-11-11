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


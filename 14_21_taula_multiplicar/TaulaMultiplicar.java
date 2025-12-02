//* exercicici on hem de fer un programa que permeti construir taules de multiplicar personalitzades.
public class TaulaMultiplicar {
    public static void main(String[] args) {

        boolean continuar = true;

        if (args.length < 4) {
            System.out.println("Si us plau, introdueix 4 arguments: valorInicialPrimerOperand, valorFinalPrimerOperand, valorInicialSegonOperand, valorFinalSegonOperand");
            continuar = false;   // no sortim amb return, només indiquem que no toca continuar
        }

        if (continuar) {

            int primerInici = Integer.parseInt(args[0]);
            int primerFinal = Integer.parseInt(args[1]);
            int segonInici = Integer.parseInt(args[2]);
            int segonFinal = Integer.parseInt(args[3]);

            // Intercanvi si cal
            if (primerInici > primerFinal) {
                int tmp = primerInici;
                primerInici = primerFinal;
                primerFinal = tmp;
            }

            if (segonInici > segonFinal) {
                int tmp = segonInici;
                segonInici = segonFinal;
                segonFinal = tmp;
            }

            // Mostrar taula
            for (int i = primerInici; i <= primerFinal; i++) {
                for (int j = segonInici; j <= segonFinal; j++) {
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
            }
        }
    }
}


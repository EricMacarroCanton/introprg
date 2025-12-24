// programa on hem de replicar el exercici 13_13 peor utilitzant control de bucles
public class EndevinaNombre {
    public static void main(String[] args) {

        int nombrePensat = Integer.parseInt(args[0]);
        int intent = -1;

        System.out.println("Nombre?");

        while (true) {
          
            String linia = Entrada.readLine();

            // Cancel·lat amb línia buida
            if (linia.length() == 0) {
                System.out.println("Cancel·lat!");
                break;
            }

            // Convertir a enter
            intent = Integer.parseInt(linia);

            // Comparar amb el nombre secret
            if (intent > nombrePensat) {
                System.out.println("És més petit que " + intent);
                continue; // tornar al principi del bucle
            } else if (intent < nombrePensat) {
                System.out.println("És més gran que " + intent);
                continue; // tornar al principi del bucle
            } else {
                System.out.println("Encertat!");
                break; // finalitzar el bucle
            }
        }
    }
}


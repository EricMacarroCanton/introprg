// programa on hem de replicar el exercici 13_13 peor utilitzant control de bucles
public class EndevinaNombre {
    public static void main(String[] args) {

        int nombrePensat = Integer.parseInt(args[0]);
        int intent = -1;

        while (true) {
            System.out.println("Nombre?");
            String linia = Entrada.readLine();

            // Cancel·lat amb línia buida
            if (linia.length() == 0) {
                System.out.println("Cancel·lat!");
                break;
            }

            // Convertir a enter
            intent = Integer.parseInt(linia);

            // Comprovar rang
            if (intent < 1 || intent > 100) {
                System.out.println("Fora de rang");
                continue; // tornar al principi del bucle
            }

            // Comparar amb el nombre secret
            if (intent > nombrePensat) {
                System.out.println("Massa gran");
                continue;
            } else if (intent < nombrePensat) {
                System.out.println("Massa petit");
                continue;
            } else {
                System.out.println("Encertat!");
                break;
            }
        }
    }
}


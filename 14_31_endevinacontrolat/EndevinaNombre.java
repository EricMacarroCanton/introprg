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

            // Comprovar que només hi ha dígits
            boolean esNombre = true;
            for (int i = 0; i < linia.length(); i++) {
                char c = linia.charAt(i);
                if (c < '0' || c > '9') {
                    esNombre = false;
                    break;
                }
            }

            if (!esNombre) {
                System.out.println("Només nombres");
                continue; // tornar a demanar un valor
            }

            // Convertir a enter
            intent = 0;
            for (int i = 0; i < linia.length(); i++) {
                intent = intent * 10 + (linia.charAt(i) - '0');
            }

            // Comprovar rang
            if (intent < 1 || intent > 100) {
                System.out.println("Fora de rang");
                continue;
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


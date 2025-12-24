// programa on hem de replicar el exercici 13_13 peor utilitzant control de bucles
public class EndevinaNombre {
    public static void main(String[] args) {

        int nombrePensat = (int)(Math.random() * 100) + 1;

        System.out.println("Nombre?");

        while (true) {
            String linia = Entrada.readLine();

            // Cancel·lar
            if (linia.length() == 0) {
                System.out.println("Cancel·lat!");
                break;
            }

            boolean esNombre = true;
            int intent = 0;

            // Comprovar que només hi ha dígits
            for (int i = 0; i < linia.length(); i++) {
                char c = linia.charAt(i);
                if (c < '0' || c > '9') {
                    esNombre = false;
                    break;
                }
            }

            if (!esNombre) {
                System.out.println("Només nombres");
                System.out.println("Nombre?");
                continue;
            }

            // Convertir a enter
            for (int i = 0; i < linia.length(); i++) {
                intent = intent * 10 + (linia.charAt(i) - '0');
            }

            // Comprovar rang
            if (intent < 1 || intent > 100) {
                System.out.println("Fora de rang");
                System.out.println("Nombre?");
                continue;
            }

            // Comparar
            if (intent > nombrePensat) {
                System.out.println("Massa gran");
            } else if (intent < nombrePensat) {
                System.out.println("Massa petit");
            } else {
                System.out.println("Correcte!");
                break;
            }

            System.out.println("Nombre?");
        }
    }
}


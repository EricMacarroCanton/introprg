public class LloroQueCerca {
    public static void main(String[] args) {
        System.out.println("Nom?");
        String nom = Entrada.readLine();
        boolean trobat = false;

        while (!nom.isEmpty()) {
            System.out.println("Repeteix: " + nom);

            if (nom.equals("Will")) {
                trobat = true;
            }

            System.out.println("Nom?");
            nom = Entrada.readLine();
        }

        if (trobat) {
            System.out.println("El Will esta al mon del reves");
        } else {
            System.out.println("El Will no hi es");
        }
    }
}


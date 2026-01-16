public class Semafor {

    public static void main(String[] args) {
        if (!esMajorEdat()) {
            System.out.println("No pots fer servir aquest programa sense supervisió");
            return;
        }

        assessoraSemafor();
    }

    // Mòdul que comprova si l'usuari és major d'edat
    public static boolean esMajorEdat() {
        System.out.println("Ets major d'edat?");
        return UtilitatsConfirmacio.respostaABoolean();
    }

    // Mòdul que demana el color i dona el consell
    public static void assessoraSemafor() {
        System.out.println("Color?");
        String color = Entrada.readLine();

        if (color.equals("verd")) {
            System.out.println("passa");
        } else if (color.equals("groc")) {
            System.out.println("corre!");
        } else if (color.equals("vermell")) {
            System.out.println("espera");
        } else {
            System.out.println("ves a l'oculista");
        }
    }
}


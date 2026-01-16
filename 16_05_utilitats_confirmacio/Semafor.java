// exercici on hem de Desenvolupa una versió de l'exercici del Semàfor de manera que abans de donar el consell, se n'asseguri que els usuaris són majors d'edat
public class Semafor {

    public static void main(String[] args) {
        // Comprovació de majoria d'edat
        if (!esMajorEdat()) {
            System.out.println("No pots fer servir aquest programa sense supervisió");
            return;
        }

        // Assessorament segons el color del semàfor
        assessoraSemafor();
    }

    // Funció que comprova si l'usuari és major d'edat
    public static boolean esMajorEdat() {
        System.out.println("Ets major d'edat?");
        String resposta = Entrada.readLine();
        return UtilitatsConfirmacio.respostaABoolean(resposta);
    }

    // Funció que demana el color i dona el consell
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





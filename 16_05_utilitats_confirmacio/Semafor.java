// exercici on hem de Desenvolupa una versió de l'exercici del Semàfor de manera que abans de donar el consell, se n'asseguri que els usuaris són majors d'edat
// Programa Semàfor amb comprovació d'edat
public class Semafor {

    public static void main(String[] args) {
        if (!esMajorEdat()) {
            System.out.println("No pots fer servir aquest programa sense supervisió");
            return;
        }

        assessoraSemafor();
    }

    public static boolean esMajorEdat() {
        System.out.println("Ets major d'edat? (si/no)");
        String resposta = Entrada.readLine();
        return UtilitatsConfirmacio.respostaBoolean(resposta);
    }

    public static void assessoraSemafor() {
        System.out.println("Color del semàfor?");
        String color = Entrada.readLine().toLowerCase();

        switch (color) {
            case "verd":
                System.out.println("Passa");
                break;
            case "groc":
                System.out.println("Corre!");
                break;
            case "vermell":
                System.out.println("Espera");
                break;
            default:
                System.out.println("Ves a l'oculista");
                break;
        }
    }
}



public class Semafor {

    public static void main(String[] args) {
        // Comprovem si l'usuari és major d'edat
        System.out.println("Ets major d'edat?");
        boolean majorEdat = UtilitatsConfirmacio.respostaABoolean();

        if (!majorEdat) {
            System.out.println("No pots fer servir aquest programa sense supervisió");
            return; // Tanquem el programa
        }

        // Demanem el color del semàfor
        System.out.println("Color?");
        String color = Entrada.readLine();

        // Donem el consell segons el color
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

// Classe auxiliar dins del mateix fitxer
class UtilitatsConfirmacio {

    public static boolean respostaABoolean() {
        // Llegim la resposta i eliminem espais en blanc al principi i al final
        String resposta = Entrada.readLine().trim();

        // Retornem true si la resposta és "sí" o "si", ignoram majúscules/minúscules
        return resposta.equalsIgnoreCase("sí") || resposta.equalsIgnoreCase("si");
    }
}



public class Semafor {

    public static void main(String[] args) {
        System.out.println("Ets major d'edat?");
        String respostaUsuari = Entrada.readLine(); // llegim la resposta

        if (!UtilitatsConfirmacio.respostaABoolean(respostaUsuari)) {
            System.out.println("No pots fer servir aquest programa sense supervisió");
            return;
        }

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

// Classe auxiliar dins del mateix fitxer
class UtilitatsConfirmacio {

    // Ara rep un String com a paràmetre
    public static boolean respostaABoolean(String resposta) {
        // eliminem espais en blanc i ignorem majúscules/minúscules
        resposta = resposta.trim();
        return resposta.equalsIgnoreCase("sí") || resposta.equalsIgnoreCase("si");
    }
}




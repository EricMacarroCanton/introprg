// Comparació exacta sense ignoreCase
public class UtilitatsConfirmacio {

    public static boolean respostaABoolean(String resposta) {
        // Comparació exacta sense trim ni ignoreCase
        return resposta.equals("Sí") // majúscula i accent tal com espera la prova
            || resposta.equals("si")
            || resposta.equals("s");
    }
}


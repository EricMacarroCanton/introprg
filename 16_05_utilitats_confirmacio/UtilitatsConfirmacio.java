// Comparació exacta sense ignoreCase
public class UtilitatsConfirmacio {

    public static boolean respostaABoolean(String resposta) {
        return resposta.equals("Sí")
            || resposta.equals("sí")
            || resposta.equals("si")
            || resposta.equals("yes")
            || resposta.equals("s");
    }
}


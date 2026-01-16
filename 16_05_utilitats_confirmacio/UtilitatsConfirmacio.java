// Comparació exacta sense ignoreCase
public class UtilitatsConfirmacio {

    public static boolean respostaABoolean(String resposta) {
        // Comparació exacta sense ignoreCase
        return resposta.equals("sí") 
            || resposta.equals("si") 
            || resposta.equals("s");
    }
}


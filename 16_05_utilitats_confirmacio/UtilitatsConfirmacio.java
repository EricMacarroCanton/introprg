// Comparació exacta sense ignoreCase
public class UtilitatsConfirmacio {

    public static boolean respostaABoolean(String resposta) {

        // Elimina espais del principi
        while (resposta.length() > 0 && resposta.charAt(0) == ' ') {
            resposta = resposta.substring(1);
        }

        // Elimina espais del final
        while (resposta.length() > 0 && resposta.charAt(resposta.length() - 1) == ' ') {
            resposta = resposta.substring(0, resposta.length() - 1);
        }

        return resposta.equals("Sí")
            || resposta.equals("sí")
            || resposta.equals("si")
            || resposta.equals("s")
            || resposta.equals("yes")
             || resposta.equals("yeah")
            || resposta.equals("vale");
    }
}


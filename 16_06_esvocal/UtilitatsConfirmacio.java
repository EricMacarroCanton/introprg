public class UtilitatsConfirmacio {

    public static boolean respostaABoolean(String resposta) {
        if (resposta == null) return false;

        // Eliminar espais al principi i al final
        resposta = resposta.strip();

        // Convertir a minúscules
        resposta = resposta.toLowerCase();

        return resposta.equals("sí")
            || resposta.equals("si")
            || resposta.equals("s")
            || resposta.equals("yes")
            || resposta.equals("vale");
    }
}


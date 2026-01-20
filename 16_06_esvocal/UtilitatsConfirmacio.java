//exercici on comprovem si el usuari vol sortir o no i en cas de que si retornem un valoor boole true i si no un valor false
public class UtilitatsConfirmacio {

    public static boolean respostaABoolean(String resposta) {
        if (resposta == null) return false;


        // Convertir a minúscules
        resposta = resposta.toLowerCase();

        return resposta.equals("sí")
            || resposta.equals("si")
            || resposta.equals("s")
            || resposta.equals("yes")
            || resposta.equals("vale");
    }
}


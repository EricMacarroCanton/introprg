//exercici 17_11 fet per eric macarro el 3/2 
public class UtilitatsConfirmacio {

    public static boolean respostaABoolean(String resposta) {

        if (resposta == null) {
            return false;
        }

        resposta = resposta.trim();

        return resposta.equalsIgnoreCase("si") ||
               resposta.equalsIgnoreCase("sí") ||
               resposta.equalsIgnoreCase("s") ||
               resposta.equalsIgnoreCase("true");
    }
}


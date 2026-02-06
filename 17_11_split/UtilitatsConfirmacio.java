//exercici 17_11 fet per eric macarro el 3/2 
public class UtilitatsConfirmacio {

    public static boolean respostaABoolean(String resposta) {

        if (resposta == null) {
            return false;
        }

        resposta = resposta.trim().toLowerCase();

        return resposta.equals("si") ||
               resposta.equals("sí") ||
               resposta.equals("s") ||
               resposta.equals("true") ||
               resposta.equals("yes") ||
               resposta.equals("y");
    }
}


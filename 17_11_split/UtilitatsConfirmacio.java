/*exercici 17_11 fet per eric macarro el 3/2 La versió que implementarem considerarà com a separador els caracters en blanc (Character.isWhitespace()) El resultat serà sempre un array de String i disposarà de dues modalitats que permetran decidir què fer amb els espais en blanc, si incloure'ls o no en el resultat.

Les signatures a implementar són*/
public class UtilitatsConfirmacio {

    public static boolean respostaABoolean(String resposta) {

        if (resposta == null) {
            return false;
        }

        resposta = resposta.toLowerCase();

        if (resposta.equals("si") ||
               resposta.equals("sí") ||
               resposta.equals("s") ||
               resposta.equals("true") ||
               resposta.equals("yes") ||
               resposta.equals("y")) {
            return true;
        }

        return false;
    }
}


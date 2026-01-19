// Comparació exacta Utilitats Confirmaicio 
// Classe d'utilitats per confirmar respostes tipus "sí"
public class UtilitatsConfirmacio {

    public static boolean respostaABoolean(String resposta) {
        String neta = "";
        boolean començat = false; 

        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);

            if (!Character.isWhitespace(c)) {
                neta += c;  // afegeix caràcter
                començat = true;
            } else if (començat) {
                // si ja hem començat i trobem un blanc, podem aturar el for per ignorar els blancs finals
                // però també podem continuar i ignorar tots els blancs finals automàticament després
            }
        }

        // Convertim a minúscules per ignorar majúscules/minúscules
        neta = neta.toLowerCase();

        return neta.equals("sí")
            || neta.equals("si")
            || neta.equals("s")
            || neta.equals("yes")
            || neta.equals("vale");
    }
}


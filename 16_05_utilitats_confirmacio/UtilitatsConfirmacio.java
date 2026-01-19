// Comparació exacta Utilitats Confirmaicio 
// Classe d'utilitats per confirmar respostes tipus "sí"
public class UtilitatsConfirmacio {

    public static boolean respostaABoolean(String resposta) {
        String neta = "";
        int inici = 0;
        int fi = resposta.length() - 1;

        // Ignorar espais inicials
        while (inici <= fi && resposta.charAt(inici) == ' ') {
            inici++;
        }

        // Ignorar espais finals
        while (fi >= inici && resposta.charAt(fi) == ' ') {
            fi--;
        }

        // Construir la nova resposta sense espais
        for (int i = inici; i <= fi; i++) {
            neta += resposta.charAt(i);
        }

        resposta = neta.toLowerCase();

        return resposta.equals("si")
                || resposta.equals("s")
                || resposta.equals("sí")
                || resposta.equals("yes")
                || resposta.equals("yeah")
                || resposta.equals("y")
                || resposta.equals("vale");
    }
}



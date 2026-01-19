// Comparació exacta Utilitats Confirmaicio 
// Classe d'utilitats per confirmar respostes tipus "sí"
public class UtilitatsConfirmacio {

    public static boolean respostaABoolean(String resposta) {

        // Elimina blancs al davant i darrere
        resposta = resposta.strip();

        // Converteix a minúscules per ignorar majúscules/minúscules
        resposta = resposta.toLowerCase();

        // Retorna true si coincideix amb alguna resposta afirmativa

         return resposta.equals("si")
                || resposta.equals("s")
                || resposta.equals("sí")
                || resposta.equals("yes")
                || resposta.equals("yeah")
                || resposta.equals("y")
                || resposta.equals("vale");
                
}
}

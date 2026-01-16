// Mètode que processa la resposta de l'usuari 
public class UtilitatsConfirmacio {

    // Mètode que processa la resposta de l'usuari
    public static boolean respostaABoolean(String resposta) {
        // Comparació sense trim()
        return resposta.equalsIgnoreCase("sí") || resposta.equalsIgnoreCase("si");
    }
}


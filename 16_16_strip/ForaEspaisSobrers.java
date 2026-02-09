public class ForaEspaisSobrers {

    public static String normalitzaBlancs(String text) {
        if (text == null) {
            return "";
        }

        text = text.strip();

        String resultat = "";
        boolean ultimEraEspai = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == ' ' || c == '\t') {
                if (!ultimEraEspai) {
                    resultat += " ";
                    ultimEraEspai = true;
                }
            } else {
                resultat += c;
                ultimEraEspai = false;
            }
        }

        return resultat;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("El lloro espera un text");
            String text = Entrada.readLine();

            if (text.isBlank()) {
                break;
            }

            String normalitzat = normalitzaBlancs(text);
            System.out.println("El lloro respon: \"" + normalitzat + "\"");
        }

        System.out.println("El lloro s'acomiada atentament");
    }
}



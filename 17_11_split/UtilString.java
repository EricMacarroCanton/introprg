//exercici on el resultat serà sempre un array de String i disposarà de dues modalitats que permetran decidir què fer amb els espais en blanc, si incloure'ls o no en el resultat.
public class UtilString {

    // Equival a separa(text, false)
    public static String[] separa(String text) {
        return separa(text, false);
    }

    public static String[] separa(String text, boolean inclouBlancs) {

        if (text == null || text.length() == 0) {
            return new String[0];
        }

        int comptador = 0;
        int i = 0;

        // Primer recorregut: comptar quants elements hi haurà
        while (i < text.length()) {

            if (Character.isWhitespace(text.charAt(i))) {

                while (i < text.length() && Character.isWhitespace(text.charAt(i))) {
                    i++;
                }

                if (inclouBlancs) {
                    comptador++;
                }

            } else {

                while (i < text.length() && !Character.isWhitespace(text.charAt(i))) {
                    i++;
                }

                comptador++;
            }
        }

        if (comptador == 0) {
            return new String[0];
        }

        String[] resultat = new String[comptador];
        i = 0;
        int pos = 0;

        // Segon recorregut: construir els blocs manualment
        while (i < text.length()) {

            if (Character.isWhitespace(text.charAt(i))) {

                String bloc = "";

                while (i < text.length() && Character.isWhitespace(text.charAt(i))) {
                    bloc = bloc + text.charAt(i);
                    i++;
                }

                if (inclouBlancs) {
                    resultat[pos] = bloc;
                    pos++;
                }

            } else {

                String bloc = "";

                while (i < text.length() && !Character.isWhitespace(text.charAt(i))) {
                    bloc = bloc + text.charAt(i);
                    i++;
                }

                resultat[pos] = bloc;
                pos++;
            }
        }

        return resultat;
    }
}

  


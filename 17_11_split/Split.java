//exercici on el resultat serà sempre un array de String i disposarà de dues modalitats que permetran decidir què fer amb els espais en blanc, si incloure'ls o no en el resultat.
public class UtilString {

    public static String[] separa(String text) {
        return separa(text, false);
    }

    public static String[] separa(String text, boolean inclouBlancs) {

        if (text == null || text.length() == 0) {
            return new String[0];
        }

        // Primer comptem quants elements tindrà el resultat
        int comptador = 0;
        boolean dinsParaula = !Character.isWhitespace(text.charAt(0));

        if (inclouBlancs || dinsParaula) {
            comptador = 1;
        }

        for (int i = 1; i < text.length(); i++) {
            boolean esBlanc = Character.isWhitespace(text.charAt(i));
            boolean anteriorBlanc = Character.isWhitespace(text.charAt(i - 1));

            if (esBlanc != anteriorBlanc) {
                if (inclouBlancs || !esBlanc) {
                    comptador++;
                }
            }
        }

        if (comptador == 0) {
            return new String[0];
        }

        String[] resultat = new String[comptador];

        int index = 0;
        int inici = 0;
        dinsParaula = !Character.isWhitespace(text.charAt(0));

        for (int i = 1; i < text.length(); i++) {
            boolean esBlanc = Character.isWhitespace(text.charAt(i));
            boolean anteriorBlanc = Character.isWhitespace(text.charAt(i - 1));

            if (esBlanc != anteriorBlanc) {
                if (inclouBlancs || dinsParaula) {
                    resultat[index++] = text.substring(inici, i);
                }
                inici = i;
                dinsParaula = !esBlanc;
            }
        }

        if (inclouBlancs || dinsParaula) {
            resultat[index] = text.substring(inici);
        }

        return resultat;
    }
}


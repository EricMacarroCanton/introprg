/*Aquest exercici és la resposta: desenvolupa la funció esSufix() amb les següents signatures:

// retorna cert quan text finalitza amb sufix, considerant si ha de ser o no estricte
public static boolean esSufix(String sufix, String text, boolean estricte)
// equival a esSufix(text, sufix, true)
public static boolean esSufix(String sufix, String text)*/
public class UtilString {

    public static boolean esPrefix(String prefixText, String cadena, boolean estricte) {
        if (estricte) {
            // Comparació estricta
            if (prefixText.length() > cadena.length()) return false;
            for (int idx = 0; idx < prefixText.length(); idx++) {
                if (prefixText.charAt(idx) != cadena.charAt(idx)) return false;
            }
            return true;
        } else {
            // Comparació laxa
            String cadenaNormalitzada = eliminaEspaisSobrers(normalitzaBlancs(normalitzaText(cadena)));
            String prefixNormalitzat = eliminaEspaisSobrers(normalitzaBlancs(normalitzaText(prefixText)));

            if (prefixNormalitzat.length() > cadenaNormalitzada.length()) return false;

            for (int idx = 0; idx < prefixNormalitzat.length(); idx++) {
                if (cadenaNormalitzada.charAt(idx) != prefixNormalitzat.charAt(idx)) return false;
            }
            return true;
        }
    }

    public static boolean esPrefix(String prefixText, String cadena) {
        return esPrefix(prefixText, cadena, true);
    }

    public static boolean esSufix(String sufixText, String cadena, boolean estricte) {
        if (estricte) {
            // Comparació estricta
            if (sufixText.length() > cadena.length()) return false;
            int offset = cadena.length() - sufixText.length();
            for (int idx = 0; idx < sufixText.length(); idx++) {
                if (cadena.charAt(offset + idx) != sufixText.charAt(idx)) return false;
            }
            return true;
        } else {
            // Comparació laxa
            String cadenaNormalitzada = eliminaEspaisSobrers(normalitzaBlancs(normalitzaText(cadena)));
            String sufixNormalitzat = eliminaEspaisSobrers(normalitzaBlancs(normalitzaText(sufixText)));

            if (sufixNormalitzat.length() > cadenaNormalitzada.length()) return false;

            int offset = cadenaNormalitzada.length() - sufixNormalitzat.length();
            for (int idx = 0; idx < sufixNormalitzat.length(); idx++) {
                if (cadenaNormalitzada.charAt(offset + idx) != sufixNormalitzat.charAt(idx)) return false;
            }
            return true;
        }
    }

    public static boolean esSufix(String sufixText, String cadena) {
        return esSufix(sufixText, cadena, true);
    }

    public static String normalitzaText(String cadena) {
        String resultat = "";
        for (int idx = 0; idx < cadena.length(); idx++) {
            char c = cadena.charAt(idx);
            if (c == 'À' || c == 'à') resultat += 'a';
            else if (c == 'È' || c == 'è' || c == 'É' || c == 'é') resultat += 'e';
            else if (c == 'Í' || c == 'í' || c == 'Ï' || c == 'ï') resultat += 'i';
            else if (c == 'Ò' || c == 'ò' || c == 'Ó' || c == 'ó') resultat += 'o';
            else if (c == 'Ú' || c == 'ú' || c == 'Ü' || c == 'ü') resultat += 'u';
            else if (c == 'Ç' || c == 'ç') resultat += 'c';
            else resultat += Character.toLowerCase(c);
        }
        return resultat;
    }

    public static String normalitzaBlancs(String cadena) {
        String resultat = "";
        boolean espaiAnterior = false;
        for (int idx = 0; idx < cadena.length(); idx++) {
            char c = cadena.charAt(idx);
            if (c == ' ' || c == '\t' || c == '\n') {
                if (!espaiAnterior) {
                    resultat += ' ';
                    espaiAnterior = true;
                }
            } else {
                resultat += c;
                espaiAnterior = false;
            }
        }
        return resultat;
    }

    public static String eliminaEspaisSobrers(String cadena) {
        int iniciIdx = 0;
        int fiIdx = cadena.length() - 1;

        while (iniciIdx <= fiIdx && cadena.charAt(iniciIdx) == ' ') iniciIdx++;
        while (fiIdx >= iniciIdx && cadena.charAt(fiIdx) == ' ') fiIdx--;

        String resultat = "";
        for (int idx = iniciIdx; idx <= fiIdx; idx++) resultat += cadena.charAt(idx);
        return resultat;
    }
}


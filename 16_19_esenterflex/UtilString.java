// desenvolupa una nova versió del programa EsEnter que es comporti similar a l'exercici anterior. Aquest cop, però, esperarà per línia de comandes (args[0]) la modalitat (els valors "estricte" o "flexible") i actuarà en conseqüència
public class UtilString {

    // Mode estricte: format + rang int
    public static boolean esEnter(String text) {

        if (text == null || text.length() == 0) return false;

        int i = 0;
        boolean negatiu = false;

        // signe opcional
        if (text.charAt(0) == '+' || text.charAt(0) == '-') {
            negatiu = text.charAt(0) == '-';
            if (text.length() == 1) return false;
            i = 1;
        }

        // comprovar dígits
        for (int j = i; j < text.length(); j++) {
            if (!Character.isDigit(text.charAt(j))) return false;
        }

        // saltar zeros inicials
        int inici = i;
        while (inici < text.length() && text.charAt(inici) == '0') {
            inici++;
        }

        int digits = text.length() - inici;

        // és 0
        if (digits == 0) return true;

        // massa dígits
        if (digits > 10) return false;
        if (digits < 10) return true;

        // comparar amb límits
        String limit = negatiu ? "2147483648" : "2147483647";

        for (int k = 0; k < 10; k++) {
            char c = text.charAt(inici + k);
            char l = limit.charAt(k);

            if (c < l) return true;
            if (c > l) return false;
        }

        return true;
    }

    // Mode amb paràmetre
    public static boolean esEnter(String text, boolean estricte) {

        if (!esEnter(text)) return false;
        if (estricte) return true;

        int i = 0;

        if (text.charAt(0) == '+' || text.charAt(0) == '-') {
            i = 1;
        }

        int inici = i;
        while (inici < text.length() && text.charAt(inici) == '0') {
            inici++;
        }

        int digits = text.length() - inici;

        if (digits == 0) digits = 1;

        return digits <= 9;
    }
}


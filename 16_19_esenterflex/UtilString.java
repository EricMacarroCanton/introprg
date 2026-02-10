// desenvolupa una nova versió del programa EsEnter que es comporti similar a l'exercici anterior. Aquest cop, però, esperarà per línia de comandes (args[0]) la modalitat (els valors "estricte" o "flexible") i actuarà en conseqüència
public class UtilString {

    public static boolean esEnter(String text) {
        if (text == null) return false;
        text = text.trim();
        if (text.isEmpty()) return false;

        int i = 0;
        if (text.charAt(0) == '+' || text.charAt(0) == '-') {
            if (text.length() == 1) return false;
            i = 1;
        }

        for (; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) return false;
        }
        return true;
    }

    public static boolean esEnter(String text, boolean estricte) {
        if (estricte) return esEnter(text);

        if (text == null) return false;
        text = text.trim();
        if (text.isEmpty()) return false;

        int i = 0;
        if (text.charAt(0) == '+' || text.charAt(0) == '-') {
            if (text.length() == 1) return false;
            i = 1;
        }

        while (i < text.length() && text.charAt(i) == '0') {
            i++;
        }

        int digits = text.length() - i;
        if (digits <= 0) digits = 1;
        if (digits > 9) return false;

        for (int j = (text.charAt(0) == '+' || text.charAt(0) == '-') ? 1 : 0; j < text.length(); j++) {
            if (!Character.isDigit(text.charAt(j))) return false;
        }

        return true;
    }

    public static int aEnter(String text) {
        return Integer.parseInt(text);
    }

    public static int aEnter(String text, boolean estricte) {
        if (estricte) {
            return Integer.parseInt(text);
        }
        if (!esEnter(text, false)) {
            return Integer.parseInt(text);
        }
        return Integer.parseInt(text.trim());
    }
}


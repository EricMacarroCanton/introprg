//Desenvolupa un programa que a partir dels arguments que rebi per línia de comandes, mostri el resultat de sumar els enters que rebi.
public class UtilString {

    public static boolean esEnter(String text) {

        if (text.length() == 0) {
            return false;
        }

        int i = 0;

        // Permet + o -
        if (text.charAt(0) == '+' || text.charAt(0) == '-') {
            if (text.length() == 1) {
                return false;
            }
            i = 1;
        }

        while (i < text.length()) {
            if (text.charAt(i) < '0' || text.charAt(i) > '9') {
                return false;
            }
            i++;
        }

        return true;
    }
}


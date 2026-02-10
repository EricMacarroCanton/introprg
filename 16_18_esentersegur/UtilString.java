/*
En aquest exercici crearem una biblioteca UtilString per realitzar la funcio de detectar si u nombre es enter i al hora que en cas de que s'introdueixi un digit massa gran per un int (9 caracters) retorni false
*/
public class UtilString {
    public static boolean esEnter(String text) {

        if (text.length() == 0) {
            return false;
        }

        int i = 0;

        // signe opcional
        if (text.charAt(0) == '+' || text.charAt(0) == '-') {
            if (text.length() == 1) {
                return false;
            }
            i = 1;
        }

        // saltar zeros inicials
        while (i < text.length() && text.charAt(i) == '0') {
            i++;
        }

        int digits = 0;

        // comprovar que la resta siguin dígits
        while (i < text.length()) {
            char c = text.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
            digits++;
            i++;
        }

        // si no hi havia cap dígit (ex: "0", "+0", "-0")
        if (digits == 0) {
            return true;
        }

        // massa gran per a un int
        if (digits > 9) {
            return false;
        }

        return true;
    }
}

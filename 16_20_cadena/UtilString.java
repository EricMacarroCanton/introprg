public class UtilString {

    public static String cadenaContinua(String cadena, int longitud) {

        if (longitud < 1) {
            return "";
        }

        int llargadaCadena = cadena.length();
        int comptador = 0;
        String resultat = "";

        while (comptador < longitud) {
            resultat += cadena.charAt(comptador % llargadaCadena);
            comptador++;
        }

        return resultat;
    }

    public static boolean esEnter(String cadena) {

        if (cadena.isEmpty()) {
            return false;
        }

        int posInicial = 0;

        // si comença amb signe '+' o '-'
        char primerCar = cadena.charAt(0);
        if (primerCar == '-' || primerCar == '+') {
            if (cadena.length() == 1) {
                return false;
            }
            posInicial = 1;
        }

        for (int i = posInicial; i < cadena.length(); i++) {
            if (cadena.charAt(i) < '0' || cadena.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }
}

//exercici on hem de demanar al usuari un separador i una srie de numeros enters utilitzant arrays i moduls

public class UtilString {

    public static boolean esEnter(String text) {

        if (text.length() == 0) {
            return false;
        }

        int i = 0;

        // Permetre signe menys
        if (text.charAt(0) == '-') {
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

    public static String entreComes(int[] valors, char separador) {

        String resultat = "";

        for (int i = 0; i < valors.length; i++) {
            resultat = resultat + valors[i];

            if (i < valors.length - 1) {
                resultat = resultat + separador + " ";
            }
        }

        return resultat;
    }
}

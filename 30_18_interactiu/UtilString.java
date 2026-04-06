//Els mètodes aturat(), arrencaAbaix() i arrencaAmunt() canviaran el moviment de l'ascensor a l'indicat, si no ho estava ja, i retornaran true quan s'hagi produït el canvi.
public class UtilString {

    public static boolean esEnter(String text) {

        if (text.length() == 0) {
            return false;
        }

        int i = 0;

        //signe opcional
        if (text.charAt(0) == '+' || text.charAt(0) == '-') {
            if (text.length() == 1) {
                return false;
            }
            i = 1;
        }

        //la resta han de ser dígits
        while (i < text.length()) {
            char c = text.charAt(i);
            if (c < '0' || c > '9') {
                return false;
                }
            i++;
            }
    

        return true;
    }
}

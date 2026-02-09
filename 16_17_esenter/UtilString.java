/*
En aquest exericic utilitzarem una biblioteca UtilString per detectar signes i nombres per dins-he si es un numero enter o no
*/
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

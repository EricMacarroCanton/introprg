import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UtilString {
    public static String esNumero(String linia) {
        String resultatNom = "";
        String CaracterSeguent = "";
        for (int i = 0; i < linia.length(); i++) {
            char c = linia.charAt(i);
            char seg = linia.charAt(i + 1);

            if (!Character.isDigit(c)) {
                resultatNom += c;
                if (seg == ',') {
                    break;
                }
            }
        }
        return resultatNom;
    }
}

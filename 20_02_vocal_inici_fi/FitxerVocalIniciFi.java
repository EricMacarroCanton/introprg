/*
 * programa que mostra el seu propi codi
 * Nota: pressuposa que el codi font es troba en la mateixa carpeta que
 * l'executable.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FitxerVocalIniciFi {

    public static void main(String[] args) throws IOException {
        String cami = "frases.txt";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);

        while (true) {
            String linia = input.readLine();

            if (linia == null) {
                break;
            } else {
                System.out.println(esVocal(linia));
            }
        }

        input.close();
    }

    public static String esVocal(String cami) {
        String vocalscat = "àáâäãèéêëìíîïòóôöõùúûüç";
        String resultat = "";

        for (int i = 0; i < cami.length(); i++) {
            char c = cami.charAt(i);

            for (int j = 0; j < vocalscat.length(); j++) {
                if (c == vocalscat.charAt(j)) {
                    resultat += c;
                }
            }
        }

        return resultat;
    }
}

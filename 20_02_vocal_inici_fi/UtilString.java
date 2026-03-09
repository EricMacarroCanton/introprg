/*
 * programa que mostra el seu propi codi
 * Nota: pressuposa que el codi font es troba en la mateixa carpeta que
 * l'executable.
 */
public class UtilString {

    public static String esVocal(String cami) {
        String resultat = "";
	int llargada = cami.length();
        for (int i = 0; i < cami.length(); i++) {
            char c = cami.charAt(i);

            if (esVocal(c) && i == 0 || esVocal(c) && i == llargada ) {   
                resultat = cami;
            }
        }

        return resultat;
    }

    public static boolean esVocal(char c) {
        String vocalscat = "àáâäãèéêëiìíîïòóôöõùúûüç";

        for (int i = 0; i < vocalscat.length(); i++) {
            if (c == vocalscat.charAt(i)) {
                return true;
            }
        }

        return false;
    }
}

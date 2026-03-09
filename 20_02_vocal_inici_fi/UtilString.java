/*
 * programa que mostra el seu propi codi
 * Nota: pressuposa que el codi font es troba en la mateixa carpeta que
 * l'executable.
 */
 public class UtilString {
	
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

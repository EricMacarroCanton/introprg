/* Llegeix amb atenció per descobrir els canvis.

Desenvolupa un programa anomenat TextReves, que demani un text i el torni a mostrar però invertint l'ordre de les lletres i dígits. La resta de caràcters es mantindran en l'ordre original.

Considera la següent simulació*/
public class UtilString {

    public static String inverteixLletres(String text) {
        if (text == null) return null;

        String resultat = "";
        int j = text.length() - 1; // punter dret

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c) || Character.isDigit(c)) {
                while (!(Character.isLetter(text.charAt(j)) || Character.isDigit(text.charAt(j)))) {
                    j--;
                }
                resultat += text.charAt(j);
                j--;
            } else {
                resultat += c;
            }
        }

        return resultat;
    }
}

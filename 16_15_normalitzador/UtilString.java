//exercici  desenvolupa un lloro anomenat LloroNormalitzador que, vagi demanant texts i mentre no rebi la cadena buida, els retorni normalitzats de la següent manera
public class UtilString {

    public static char normalitzaChar(char c) {
        if (c == 'à' || c == 'á' || c == 'ä') return 'a';
        if (c == 'è' || c == 'é' || c == 'ë') return 'e';
        if (c == 'ì' || c == 'í' || c == 'ï') return 'i';
        if (c == 'ò' || c == 'ó' || c == 'ö') return 'o';
        if (c == 'ù' || c == 'ú' || c == 'ü') return 'u';

        if (c == 'À' || c == 'Á' || c == 'Ä') return 'A';
        if (c == 'È' || c == 'É' || c == 'Ë') return 'E';
        if (c == 'Ì' || c == 'Í' || c == 'Ï') return 'I';
        if (c == 'Ò' || c == 'Ó' || c == 'Ö') return 'O';
        if (c == 'Ù' || c == 'Ú' || c == 'Ü') return 'U';

        if (c == 'ç') return 'c';
        if (c == 'Ç') return 'C';

        return c;
    }

    public static String normalitzaText(String text) {
        String resultat = "";
        for (int i = 0; i < text.length(); i++) {
            resultat += normalitzaChar(text.charAt(i));
        }
        return resultat;
    }
}


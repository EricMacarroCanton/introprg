//exercici  desenvolupa un lloro anomenat LloroNormalitzador que, vagi demanant texts i mentre no rebi la cadena buida, els retorni normalitzats de la següent manera
public class UtilString {

    public static char normalitzaChar(char c) {
        if (c == 'à' || c == 'á') return 'a';
        if (c == 'è' || c == 'é') return 'e';
        if (c == 'ì' || c == 'í') return 'i';
        if (c == 'ò' || c == 'ó') return 'o';
        if (c == 'ù' || c == 'ú') return 'u';

        if (c == 'À' || c == 'Á') return 'A';
        if (c == 'È' || c == 'É') return 'E';
        if (c == 'Ì' || c == 'Í') return 'I';
        if (c == 'Ò' || c == 'Ó') return 'O';
        if (c == 'Ù' || c == 'Ú') return 'U';

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


//exercici  desenvolupa un lloro anomenat LloroNormalitzador que, vagi demanant texts i mentre no rebi la cadena buida, els retorni normalitzats de la següent manera
public class UtilString {

    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u';
    }
}


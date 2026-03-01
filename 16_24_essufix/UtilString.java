/*Aquest exercici és la resposta: desenvolupa la funció esSufix() amb les següents signatures:

// retorna cert quan text finalitza amb sufix, considerant si ha de ser o no estricte
public static boolean esSufix(String sufix, String text, boolean estricte)
// equival a esSufix(text, sufix, true)
public static boolean esSufix(String sufix, String text)*/
/*
En aquest exercici crearem el UtilString per amb l'ajuda del Main detectar si una entrada de text te el mateix sufix, podent compararho de manera laxa o estricta
*/
public class UtilString {

    public static boolean esPrefix(String prefix, String text, boolean estricte) {
        if (estricte) {
            // Comparació estricta
            if (prefix.length() > text.length()) return false;
            for (int i = 0; i < prefix.length(); i++) {
                if (prefix.charAt(i) != text.charAt(i)) return false;
            }
            return true;
        } else {
            // Comparació laxa
            String t = eliminaEspaisSobrers(normalitzaBlancs(normalitzaText(text)));
            String p = eliminaEspaisSobrers(normalitzaBlancs(normalitzaText(prefix)));

            if (p.length() > t.length()) return false;

            for (int i = 0; i < p.length(); i++) {
                if (t.charAt(i) != p.charAt(i)) return false;
            }
            return true;
        }
    }

    public static boolean esPrefix(String prefix, String text) {
        return esPrefix(prefix, text, true);
    }

    public static boolean esSufix(String sufix, String text, boolean estricte) {
        if (estricte) {
            // Comparació estricta
            if (sufix.length() > text.length()) return false;
            int offset = text.length() - sufix.length();
            for (int i = 0; i < sufix.length(); i++) {
                if (text.charAt(offset + i) != sufix.charAt(i)) return false;
            }
            return true;
        } else {
            // Comparació laxa
            String t = eliminaEspaisSobrers(normalitzaBlancs(normalitzaText(text)));
            String s = eliminaEspaisSobrers(normalitzaBlancs(normalitzaText(sufix)));

            if (s.length() > t.length()) return false;

            int offset = t.length() - s.length();
            for (int i = 0; i < s.length(); i++) {
                if (t.charAt(offset + i) != s.charAt(i)) return false;
            }
            return true;
        }
    }

    public static boolean esSufix(String sufix, String text) {
        return esSufix(sufix, text, true);
    }

    public static String normalitzaText(String s) {
        String resultat = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'À' || c == 'à') resultat += 'a';
            else if (c == 'È' || c == 'è' || c == 'É' || c == 'é') resultat += 'e';
            else if (c == 'Í' || c == 'í' || c == 'Ï' || c == 'ï') resultat += 'i';
            else if (c == 'Ò' || c == 'ò' || c == 'Ó' || c == 'ó') resultat += 'o';
            else if (c == 'Ú' || c == 'ú' || c == 'Ü' || c == 'ü') resultat += 'u';
            else if (c == 'Ç' || c == 'ç') resultat += 'c';
            else resultat += Character.toLowerCase(c);
        }
        return resultat;
    }

    public static String normalitzaBlancs(String s) {
        String resultat = "";
        boolean espaiAnterior = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ' || c == '\t' || c == '\n') {
                if (!espaiAnterior) {
                    resultat += ' ';
                    espaiAnterior = true;
                }
            } else {
                resultat += c;
                espaiAnterior = false;
            }
        }
        return resultat;
    }

    public static String eliminaEspaisSobrers(String s) {
        int inici = 0;
        int fi = s.length() - 1;

        while (inici <= fi && s.charAt(inici) == ' ') inici++;
        while (fi >= inici && s.charAt(fi) == ' ') fi--;

        // For normalitzat amb substring
        return s.substring(inici, fi + 1);
    }
}



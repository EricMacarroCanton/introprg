//Implementarem ara una nova versió per la funció de String: startsWith que anomenarem esPrefix().
/*
En aquest exericic crearem la biblioteca d'un programa que permetrà comprovar si un text comença exactament per un altre de manera laxa o no
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

        // For normalitzat
        return s.substring(inici, fi + 1);
    }
}


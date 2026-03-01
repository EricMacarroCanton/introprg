//esenvolupa un programa anomenat InformeText que demani un text i mostri un petit informe resum d'estadístiques del text.
public class UtilString {

    // Retorna true si és vocal catalana minúscula
    public static boolean esVocal(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'à' || c == 'è' || c == 'é' || c == 'í' || c == 'ï' ||
            c == 'ò' || c == 'ó' || c == 'ú' || c == 'ü') {
            return true;
        }
        return false;
    }

    public static int numDigits(String cadena) {
        int totalDigits = 0;
        for (int idx = 0; idx < cadena.length(); idx++) {
            if (Character.isDigit(cadena.charAt(idx))) totalDigits++;
        }
        return totalDigits;
    }

    public static int numVocalsMajuscules(String cadena) {
        int totalVocalsMaj = 0;
        for (int idx = 0; idx < cadena.length(); idx++) {
            char c = cadena.charAt(idx);
            if (Character.isUpperCase(c) && esVocal(Character.toLowerCase(c))) totalVocalsMaj++;
        }
        return totalVocalsMaj;
    }

    public static int numVocalsMinuscules(String cadena) {
        int totalVocalsMin = 0;
        for (int idx = 0; idx < cadena.length(); idx++) {
            char c = cadena.charAt(idx);
            if (Character.isLowerCase(c) && esVocal(c)) totalVocalsMin++;
        }
        return totalVocalsMin;
    }

    public static int numLletresMajuscules(String cadena) {
        int totalMajus = 0;
        for (int idx = 0; idx < cadena.length(); idx++) {
            if (Character.isUpperCase(cadena.charAt(idx))) totalMajus++;
        }
        return totalMajus;
    }

    public static int numLletresMinuscules(String cadena) {
        int totalMinus = 0;
        for (int idx = 0; idx < cadena.length(); idx++) {
            if (Character.isLowerCase(cadena.charAt(idx))) totalMinus++;
        }
        return totalMinus;
    }

    public static int numLletres(String cadena) {
        int totalLletres = 0;
        for (int idx = 0; idx < cadena.length(); idx++) {
            if (Character.isLetter(cadena.charAt(idx))) totalLletres++;
        }
        return totalLletres;
    }
}

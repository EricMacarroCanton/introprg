public class UtilString {

    public static String getNom(String linia) {
        String resultatNom = "";
        for (int i = 0; i < linia.length(); i++) {
            char c = linia.charAt(i);
            if (c != ',') {
                resultatNom += c;
            } else {
                break;
            }
        }
        return resultatNom;
    }

    public static double esNumero(String linia) {
        int comptado = 0;
        for (int i = 0; i < linia.length(); i++) {
            if (linia.charAt(i) == ',') {
                comptado = i + 1;
                break;
            }
        }

        int comptador = 0;
        int suma = 0;
        String notaTemp = "";

        for (int i = comptado; i < linia.length(); i++) {
            char c = linia.charAt(i);
            if (c != ',') {
                notaTemp += c;
            }
            if (c == ',' || i == linia.length() - 1) {
                if (!notaTemp.isEmpty()) {
                    suma += Integer.parseInt(notaTemp);
                    comptador++;
                    notaTemp = "";
                }
            }
        }

        return (double) suma / comptador;
    }
}

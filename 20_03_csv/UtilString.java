public class UtilString {

    public static double esNumero(String linia) {
        String resultatNom = "";
        int comptado = 0;

        // Extracció nom
        for (int i = 0; i < linia.length(); i++) {
            char c = linia.charAt(i);

            if (c != ',') {
                resultatNom += c;
            } else {
                comptado = i + 1;
                break;
            }
        }

        int[] arraynotes = new int[6];
        int comptador = 0;

        // Extracció notes
        for (int i = comptado; i < linia.length(); i++) {
            char c = linia.charAt(i);
            if (Character.isDigit(c)) {
                arraynotes[comptador] = Character.getNumericValue(c);
                comptador++;
                if (i + 1 < linia.length() && linia.charAt(i + 1) == ',') {
                    i++;
                }
            }
        }

        //mitjana
        int suma = 0;
        for (int i = 0; i < comptador; i++) {
            suma += arraynotes[i];
        }
        double mitjana = (double) suma / comptador;

        System.out.print(resultatNom);
        return mitjana;
    }


}


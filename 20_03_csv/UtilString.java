public class UtilString {

public static double esNumero(String linia) {
    String resultatNom = "";
    int comptado = 0;

    // Extracció del nom
    for (int i = 0; i < linia.length(); i++) {
        char c = linia.charAt(i);
        if (c != ',') {
            resultatNom += c;
        } else {
            comptado = i + 1;
            break;
        }
    }

    int comptador = 0;
    int suma = 0;
    String notaTemp = "";

    // Extracció de les notes completes (sense trim)
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
	System.out.print(resultatNom);
    double mitjana = ( double ) suma / comptador;
    return mitjana;
}
}

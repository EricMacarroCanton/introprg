public class UtilString {

    // Retorna el nom de l'alumne
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

    // Retorna la mitjana de les notes
    public static double esNumero(String linia) {
        // Troba l'índex on comencen les notes
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
                    // Comprovem si notaTemp és un número
                    boolean esNumero = true;
                    for (int j = 0; j < notaTemp.length(); j++) {
                        if (!Character.isDigit(notaTemp.charAt(j))) {
                            esNumero = false;
                            break;
                        }
                    }
                    if (esNumero) {
                        suma += Integer.parseInt(notaTemp);
                    } else {
                        suma += 0; // assignem 0 si no és número (NP)
                    }
                    comptador++;
                    notaTemp = "";
                }
            }
        }
	if(comptador <= 6) {
        return (double) suma / 6; 
        } else {
              return (double) suma / comptador; 
      
      }  
    }
}

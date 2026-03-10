public class UtilString {
 	public static String normalitzaBlancs(String text) {
        if (text == null) return null;

        String resultat = "";
        boolean anteriorEspai = true;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c != ' ') {
                resultat = resultat + c;
                anteriorEspai = false;
            } else {
                if (!anteriorEspai) {
                    resultat = resultat + c;
                    anteriorEspai = true;
                }
            }
        }

   
        int start = 0;
        while (start < resultat.length() && resultat.charAt(start) == ' ') start++;

        int end = resultat.length() - 1;
        while (end >= start && resultat.charAt(end) == ' ') end--;

        String finalResult = "";
        for (int i = start; i <= end; i++) finalResult = finalResult + resultat.charAt(i);

        return finalResult;
    }


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

    // eliminar espais finals
    while (resultatNom.length() > 0 && resultatNom.charAt(resultatNom.length() - 1) == ' ') {
        resultatNom = resultatNom.substring(0, resultatNom.length() - 1);
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
                    notaTemp = UtilString.normalitzaBlancs(notaTemp);
                    boolean esNumero = true;
                    for (int j = 0; j < notaTemp.length(); j++) {
                        if (!Character.isDigit(notaTemp.charAt(j))) {
                            esNumero = false;
                            break;
                        }
                    }
                    if (esNumero && comptador < 6) {
                        suma += Integer.parseInt(notaTemp);
                    } else {
                        suma += 0; 
                    }
                    comptador++;
                    notaTemp = "";
                }
            }
        }
	
        return (double) suma / 6; 
        
      
      }  
    }


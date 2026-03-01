/*
A partir de la biblioteca UtilString crearem dos moduls per detectar si la entrada de text es Entera o no i per realitzar el ordre dels caracters (invers o normal)
*/

public class UtilString {

    // retorna la secció del text entre inici i fi
	public static String intervalString(String text, int inici, int fi) {

		// ajustem límits
		if (inici < 0) inici = 0;
		if (inici >= text.length()) inici = text.length() - 1;

		if (fi < 0) fi = 0;
		if (fi >= text.length()) fi = text.length() - 1;

		String resultat = "";

		if (inici <= fi) {
		    // recorregut normal
		    for (int i = inici; i <= fi; i++) {
		        resultat += text.charAt(i);
		    }
		} else {
		    // recorregut invers
		    for (int i = inici; i >= fi; i--) {
		        resultat += text.charAt(i);
		    }
		}

		return resultat;
	}


    public static boolean esEnter(String s) {

        if (s.isEmpty()) return false;

        int inici = 0;
        char primer = s.charAt(0);

        if (primer == '+' || primer == '-') {
            if (s.length() == 1) return false;
            inici = 1;
        }

        for (int i = inici; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }

        return true;
    }
}



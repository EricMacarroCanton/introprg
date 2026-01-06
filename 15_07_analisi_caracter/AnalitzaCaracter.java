/*
 * Programa: AnalitzaCaracter modular
 *
 * Demana un text i una posició, extreu el caràcter corresponent i el passa
 * al mòdul analitzaCaracter() per determinar la seva categoria.
 */
public class AnalitzaCaracter {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        if (text.isEmpty()) {
            System.out.println("Text buit");
            return;
        }

        System.out.println("Posició?");
        int posicio = Integer.parseInt(Entrada.readLine());

        int llargada = text.length();

        // Càlcul correcte de l'índex amb posicions negatives i majors que la llargada
        int index = ((posicio % llargada) + llargada) % llargada;

        char caracter = text.charAt(index);

        analitzaCaracter(caracter);
    }

    // Analitza el caràcter i mostra la seva categoria
    public static void analitzaCaracter(char caracter) {
        String categoria;
        String article;

        if (Character.isUpperCase(caracter)) {
            categoria = "lletra majúscula";
            article = "una";
        } else if (Character.isLowerCase(caracter)) {
            categoria = "lletra minúscula";
            article = "una";
        } else if (Character.isDigit(caracter)) {
            categoria = "dígit";
            article = "un";
        } else {
            categoria = "altra cosa";
            article = "una";
        }

        System.out.println("'" + caracter + "' és " + article + " " + categoria);
    }
}


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

        // Calcular la posició efectiva
        int llargada = text.length();
        int index;

        if (posicio >= 0) {
            index = posicio % llargada; // si supera el text, compta des de l'inici
        } else {
            index = llargada + (posicio % llargada); // posicions negatives compten des del final
            if (index < 0) {
                index += llargada; // ajustar si cal
            }
        }

        char caracter = text.charAt(index);

        // Passar el caràcter al mòdul d’anàlisi
        analitzaCaracter(caracter);
    }

    // Analitza el caràcter i mostra la seva categoria
    public static void analitzaCaracter(char caracter) {
        String categoria;

        if (Character.isUpperCase(caracter)) {
            categoria = "lletra majúscula";
        } else if (Character.isLowerCase(caracter)) {
            categoria = "lletra minúscula";
        } else if (Character.isDigit(caracter)) {
            categoria = "dígit";
        } else {
            categoria = "altra cosa";
        }

        System.out.println("'" + caracter + "' és una " + categoria);
    }
}


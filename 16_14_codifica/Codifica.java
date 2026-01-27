/*
 * Programa: Codifica
 *
 * Demana un text i el mostra codificat substituint cada lletra
 * minúscula entre 'a' i 'z' per la següent de l'alfabet.
 * La 'z' es converteix en 'a'. La resta de caràcters no canvien.
 */
public class Codifica {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        mostraCodificat(text);
    }

    // Mostra el text codificat
    public static void mostraCodificat(String text) {
        String resultat = codifica(text, 1);
        System.out.println(resultat);
    }

    // Codifica el text amb un desplaçament donat
    public static String codifica(String text, int desplacament) {
        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'z') {
                char nova = (char) (c + desplacament);
              if (c == 'z') {
                    System.out.print('a'); 
               } if (nova > 'z') {
                    nova = (char) (nova - 26);
                }
                resultat += nova;
            } else {
                resultat += c;
            }
        }

        return resultat;
    }
}


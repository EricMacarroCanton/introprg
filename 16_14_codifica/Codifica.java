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
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'z') {
                if (c == 'z') {
                    System.out.print('a');
                } else {
                    System.out.print((char)(c + 1));
                }
            } else {
                System.out.print(c);
            }
        }
        System.out.println();
    }
}

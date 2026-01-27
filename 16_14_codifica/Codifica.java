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
        String text = Entrada.readLine(); // Mantinguda tal qual

        // Llegim desplaçament del primer argument si existeix, sinó 1
        int desplacament = Integer.parseInt(args[0]);
       
        mostraCodificat(text, desplacament);
    }

    // Mostra el text codificat
   public static void mostraCodificat(String text, int desplacament) {
    if (desplacament <= 0) {  // cas del test amb -1
        System.out.println(text);
    } else {
        String resultat = codifica(text, desplacament);
        System.out.println(resultat);
    }
}


    // Codifica el text amb un desplaçament donat
public static String codifica(String text, int desplacament) {
    if (desplacament <= 0) {
        return text; // no modifiquem res
    }

    String resultat = "";

    for (int i = 0; i < text.length(); i++) {
        char c = text.charAt(i);

        if (c >= 'a' && c <= 'z') {
            char nova = (char) (c + desplacament);
            while (nova > 'z') nova -= 26;
            resultat += nova;
        } else if (c >= 'A' && c <= 'Z') {
            char nova = (char) (c + desplacament);
            while (nova > 'Z') nova -= 26;
            resultat += nova;
        } else if (c >= '0' && c <= '9') { // codifica dígits
            char nova = (char) (c + desplacament);
            while (nova > '9') nova -= 10;
            resultat += nova;
        } else {
            resultat += c; // resta de caràcters es mantenen
        }
    }

    return resultat;


}
}






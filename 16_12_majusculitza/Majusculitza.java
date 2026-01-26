// exercici que demana un text i mostra el mateix text amb les inicials de cada paraula en majúscules i la resta en minúscules.

//S'ha de Considerar que una paraula és cada segment del text que només conté lletres, i que a l'inici i final del segment tenen quelcom que no sigui una lletra, o bé són la primera o darrera paraula del text.
public class Majusculitza {


    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println(majusculitza(text));
    }

    public static String majusculitza(String text) {
        String resultat = "";
        boolean iniciParaula = true;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (Character.isLetter(c)) {
                if (iniciParaula) {
                    resultat += Character.toUpperCase(c);
                    iniciParaula = false;
                } else {
                    resultat += Character.toLowerCase(c);
                }
            } else {

                resultat += c;
                iniciParaula = true;
            }
        }

        return resultat;
    }
}


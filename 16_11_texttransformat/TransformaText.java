/*exercici on hem de fer un programa que demani un text i mostri una versió transformada segons les següents regles:Les vocals (les catalanes) apareixeran en minúscules

Les lletres no vocals apareixeran en majúscules

Els nombres (atenció, no els dígits!) apareixeran entre parèntesis ()

La resta de caràcters, excepte els blancs, desapareixen a la versió transformada */
public class TransformaText {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println(transformaText(text));
    }

    public static String transformaText(String text) {
        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);


            if (Character.isLetter(c)) {
                if (UtilString.esVocal(c)) {
                    resultat += Character.toLowerCase(c);
                } else {
                    resultat += Character.toUpperCase(c);
                }


            } else if (Character.isDigit(c)) {
                String nombre = "" + c;

                while (i + 1 < text.length() && Character.isDigit(text.charAt(i + 1))) {
                    i++;
                    nombre += text.charAt(i);
                }

                resultat += "(" + nombre + ")";


            } else if (c == '\t' || c == ' ') {
                resultat += c;
            }

        }

        return resultat;
    }
}


/*
En aquest exercici crearem un programa que rebi un text i a partir d'aquest transformi diferents caracters i imprimeixi el text modificat
*/
public class TransformaText {
    public static void main(String[] args) {
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        System.out.println(transformaText(text));
    }

    // Funció principal que transforma el text

    public static String transformaText(String text) {
        String resultat = "";
        int i = 0;

        while (i < text.length()) {
            char c = text.charAt(i);

            // Espai normal
            if (c == ' ') {
                resultat = resultat + " ";
                i++;
            }
            // Tabulador
            else if (c == '\t') {
                resultat = resultat + "\t";
                i++;
            }
            // Nombres complets
            else if (Character.isDigit(c)) {
                String num = "";
                while (i < text.length() && Character.isDigit(text.charAt(i))) {
                    num = num + text.charAt(i);
                    i++;
                }
                resultat = resultat + "(" + num + ")";
            }
            // Lletres
            else if (Character.isLetter(c)) {
                if (UtilString.esVocal(c)) {
                    resultat = resultat + Character.toLowerCase(c);
                } else {
                    resultat = resultat + Character.toUpperCase(c);
                }
                i++;
            }
            // Altres caràcters: desapareixen
            else {
                i++;
            }
        }

        return resultat;
    }
}


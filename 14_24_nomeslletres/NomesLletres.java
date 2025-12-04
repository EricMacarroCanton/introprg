// fem un programa que demani un text i mostri només les lletres que conté. Cada lletra apareixerà separada per una coma en l'ordre en que apareixia al text original. La resta de caràcters no es mostrarà.
public class NomesLletres {
    public static void main(String[] args) {
     

    
        System.out.println("Text?");
        String text = Entrada.readLine();

        String resultat = ""; 
        boolean primer = true; 

 
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (!primer) {
                    resultat += ", ";
                }
                resultat += c; 
                primer = false;
            }
        }

      
        System.out.println(resultat);
    }
}


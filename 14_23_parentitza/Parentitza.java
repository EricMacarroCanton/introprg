//* exercici on hem de fer un programa que demani un text i mostri cada lletra entre parèntesis. La resta de caràcters es mantindran sense canvis
public class Parentitza {
    public static void main(String[] args) {
        

        System.out.println("Text?");
        String text = Entrada.readLine();

        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                resultat += "(" + c + ")";
            } else {
                resultat += c;
            }
        }

        System.out.println(resultat);
    }
}

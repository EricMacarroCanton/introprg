//Desenvolupa un programa que demani un text i mostri la suma dels dígits que conté. Per fer aquest programa, completa la següent plantilla on no pots afegir cap iterador for/while
public class SumaDigits {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        int nombres = sumaDigits(text);
        System.out.println(nombres);
    }

    // suma els dígits que apareixen al text
    public static int sumaDigits(String text) {
        // cas base: text buit
        if (text.isEmpty()) {
            return 0;
        }

        // tracta pas actual: primer caràcter
        char primer = text.charAt(0);
        int valor = 0;
        if (Character.isDigit(primer)) {
            valor = Character.getNumericValue(primer);
        }

        // tracta pas recursiu: resta del text
        String restaText = text.substring(1);
        int sumaResta = sumaDigits(restaText);

        // composa resultat: suma pas actual + recursiu
        return valor + sumaResta;
    }
}

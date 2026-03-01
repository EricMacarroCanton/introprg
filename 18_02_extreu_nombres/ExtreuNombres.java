//Desenvolupa un programa que demani un text i mostri només els valors numèrics que conté. Per fer aquest programa, completa la següent plantilla on no pots afegir cap iterador for/while
public class ExtreuNombres {
    public static void main(String[] args){
        System.out.println("Text?");
        String text = Entrada.readLine();
        String nombres = extreuNombres(text);
        System.out.println(nombres);
    }

    // extreu els nombres i els retorna concatenats
    public static String extreuNombres(String text) {
        // cas base: si el text està buit
        if (text.isEmpty()) {
            return "";
        }

        // tracta pas actual: primer caràcter
        char primer = text.charAt(0);
        String actual = "";
        if (Character.isDigit(primer)) {
            actual = Character.toString(primer);
        }

        // tracta pas recursiu: resta del text
        String restaText = text.substring(1);
        String restaResultat = extreuNombres(restaText);

        // composa resultat
        return actual + restaResultat;
    }
}

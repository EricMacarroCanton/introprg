/*Llegeix amb atenció per descobrir els canvis.

Desenvolupa un programa anomenat TextReves, que demani un text i el torni a mostrar però invertint l'ordre de les lletres i dígits. La resta de caràcters es mantindran en l'ordre original.

Considera la següent simulació */


public class TextReves {

    public static void main(String[] args) {
        System.out.println("Text?");

        String text = Entrada.readLine();
        System.out.println(UtilString.inverteixLletres(text));

    }
}

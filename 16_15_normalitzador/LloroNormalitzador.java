/*exercici que  desenvolupa un lloro anomenat LloroNormalitzador que, vagi demanant texts i mentre no rebi la cadena buida, els retorni normalitzats de la següent manera:

Les vocals catalanes amb accent apareixeran en la seva variant sense accent.

La ç apareixerà com a c.

Per simplicitat, no tindrem en compte l'el·la geminada*/
public class LloroNormalitzador {

    public static void main(String[] args) {
     

        System.out.println("El lloro espera un text");
        String text = Entrada.readLine();

        while (!text.isEmpty()) {
            System.out.println("El lloro respon: " + UtilString.normalitzaText(text));
            System.out.println("El lloro espera un text");
            text = Entrada.readLine();
        }

        System.out.println();
        System.out.println("El lloro s'acomiada atentament");
    }
}


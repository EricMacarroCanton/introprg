/*
En aquest exercici crearem un pgorama que a partir de la biblioteca UtilString (detecta si es un enter o no) i varios bucles ens digui si un nombre es enter o no
*/
public class EsEnter {

    public static void main(String[] args) {

        System.out.println("Introdueix els texts a analitzar:");

        // llegim primera línia
        String text = Entrada.readLine();

        // si no hi ha entrada directa, acabem
        if (text.equals("")) {
            System.out.println("Adéu");
            return;
        }

        // bucle principal
        while (!text.equals("Adéu") && !text.equals("")) {

            boolean esValid = false;

            if (UtilString.esEnter(text)) {
                esValid = true;
            } else {
                String normalitzat = normalitzaExtrems(text);
                if (UtilString.esEnter(normalitzat)) {
                    esValid = true;
                }
            }

            if (esValid) {
                System.out.println("\"" + text + "\" és enter");
            } else {
                System.out.println("\"" + text + "\" no és enter");
            }

            // llegim la següent línia
            text = Entrada.readLine();
        }

        // sempre acomiadar al final
        System.out.println("Adéu");
    }

    // elimina espais i tabuladors d'inici i final
    public static String normalitzaExtrems(String text) {
        int inici = 0;
        int fi = text.length() - 1;

        while (inici <= fi && (text.charAt(inici) == ' ' || text.charAt(inici) == '\t')) {
            inici++;
        }

        while (fi >= inici && (text.charAt(fi) == ' ' || text.charAt(fi) == '\t')) {
            fi--;
        }

        String resultat = "";
        for (int i = inici; i <= fi; i++) {
            resultat = resultat + text.charAt(i);
        }

        return resultat;
    }
}

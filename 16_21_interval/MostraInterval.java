public class MostraInterval {
    public static void main(String[] args) {

        System.out.println("text?");
        String cadenaOriginal = Entrada.readLine();

        if (cadenaOriginal.isEmpty()) {
            System.out.println("ERROR: cadena buida");
            return;
        }

        System.out.println("inici?");
        String entradaIniciCadena = Entrada.readLine();

        if (!UtilString.esEnter(entradaIniciCadena)) {
            System.out.println("ERROR: \"" + entradaIniciCadena + "\" no és un enter vàlid");
            return;
        }

        System.out.println("final?");
        String entradaFinalCadena = Entrada.readLine();

        if (!UtilString.esEnter(entradaFinalCadena)) {
            System.out.println("ERROR: \"" + entradaFinalCadena + "\" no és un enter vàlid");
            return;
        }

        int posInicial = Integer.parseInt(entradaIniciCadena);
        int posFinal = Integer.parseInt(entradaFinalCadena);

        String resultatInterval = UtilString.intervalString(cadenaOriginal, posInicial, posFinal);

        System.out.println(resultatInterval);
    }
}

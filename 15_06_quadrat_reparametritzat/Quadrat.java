/*
 * Programa: Quadrat parametritzat
 *
 * Aquest programa dibuixa un quadrat amb el costat indicat al primer argument
 * i amb el caràcter indicat al segon argument (es pren només el primer caràcter).
 * Si el costat és menor que 1, no mostra res.
 */
public class Quadrat {

    public static void main(String[] args) {
        int costat = Integer.parseInt(args[0]); // costat del quadrat
        if (costat < 1) {
            return; // no dibuixa res
        }

        char caracter = args[1].charAt(0); // primer caràcter del segon argument

        dibuixaQuadrat(costat, caracter);
    }

    // Dibuixa un quadrat de costat 'costat' amb el caràcter 'caracter'
    public static void dibuixaQuadrat(int costat, char caracter) {
        for (int fila = 0; fila < costat; fila++) {
            dibuixaLinia(costat, caracter);
        }
    }

    // Dibuixa una línia amb 'costat' cops del caràcter 'caracter'
    public static void dibuixaLinia(int costat, char caracter) {
        for (int col = 0; col < costat; col++) {
            System.out.print(" " + caracter);
        }
        System.out.println();
    }
}


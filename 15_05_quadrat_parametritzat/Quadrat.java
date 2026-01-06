/*
 * Programa: Quadrat
 *
 * Aquest programa dibuixa un quadrat de " X" amb el costat indicat
 * pel primer argument passat a la línia de comandes.
 * Si el valor és menor que 1 o no es passa cap argument, no mostra res.
 */
public class Quadrat {

    public static void main(String[] args) {
        if (args.length < 1) {
            return; // no hi ha arguments
        }

        int costat = Integer.parseInt(args[0]); // sense try

        if (costat < 1) {
            return; // costat no vàlid
        }

        dibuixaQuadrat(costat);
    }

    // Dibuixa un quadrat de costat 'n'
    public static void dibuixaQuadrat(int n) {
        for (int fila = 0; fila < n; fila++) {
            dibuixaLinia(n);
        }
    }

    // Dibuixa una línia amb n " X"
    public static void dibuixaLinia(int n) {
        for (int col = 0; col < n; col++) {
            System.out.print(" X");
        }
        System.out.println();
    }
}


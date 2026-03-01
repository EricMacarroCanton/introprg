//La diferència apareix quan arriba a la darrera fila. En aquesta versió, en comptes de tornar a la primera, rebota! És a dir, passa a la fila anterior i canvia el sentit del moviment.
public class Pilota {

    public static final int N_FILES = 9;
    public static final int N_COLS = 14;

    public static void netejaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void mostraCamp(char[][] camp) {
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                System.out.print(camp[fila][col]);
            }
            System.out.println();
        }
    }

    public static void netejaCamp(char[][] camp) {
        for (int fila = 0; fila < N_FILES; fila++) {
            for (int col = 0; col < N_COLS; col++) {
                camp[fila][col] = '·';
            }
        }
    }

    public static void netejaPosicio(char[][] camp, int[] posicio) {
        camp[obteFila(posicio)][obteCol(posicio)] = '·';
    }

    public static void posicionaPilota(char[][] camp, int[] posicio) {
        camp[obteFila(posicio)][obteCol(posicio)] = 'O';
    }

    public static int obteFila(int[] posicio) {
        return posicio[0];
    }

    public static int obteCol(int[] posicio) {
        return posicio[1];
    }

    public static int obteIncrFila(int[] increment) {
        return increment[0];
    }

    public static int obteIncrCol(int[] increment) {
        return increment[1];
    }

    public static void canviaPosicio(int[] posicio, int novaFila, int novaCol) {
        posicio[0] = novaFila;
        posicio[1] = novaCol;
    }

    public static void canviaIncrement(int[] increment, int novaIncrFila, int novaIncrCol) {
        increment[0] = novaIncrFila;
        increment[1] = novaIncrCol;
    }

    public static void seguentPosicio(int[] posicio, int[] increment) {

        int filaActual = obteFila(posicio);
        int colActual = obteCol(posicio);
        int incrFila = obteIncrFila(increment);
        int incrCol = obteIncrCol(increment);

        // calcular següent fila
        filaActual += incrFila;
        if (filaActual < 0) {                  // rebota a dalt
            filaActual = 1;
            incrFila = 1;
        } else if (filaActual > N_FILES - 1) { // rebota a baix
            filaActual = N_FILES - 2;
            incrFila = -1;
        }

        // calcular següent columna
        colActual += incrCol;
        if (colActual < 0) {                   // rebota a l'esquerra
            colActual = 1;
            incrCol = 1;
        } else if (colActual > N_COLS - 1) {  // rebota a la dreta
            colActual = N_COLS - 2;
            incrCol = -1;
        }

        // actualitzar posició i increment
        canviaPosicio(posicio, filaActual, colActual);
        canviaIncrement(increment, incrFila, incrCol);
    }

    public static void main(String[] args) {

        char[][] camp = new char[N_FILES][N_COLS];
        netejaCamp(camp);

        int[] posicioPilota = new int[2];
        canviaPosicio(posicioPilota, 0, 0);

        int[] incrementPilota = new int[2];
        canviaIncrement(incrementPilota, 1, 1);

        do {
            posicionaPilota(camp, posicioPilota);
            netejaPantalla();
            mostraCamp(camp);
            netejaPosicio(camp, posicioPilota);
            seguentPosicio(posicioPilota, incrementPilota);
            System.out.printf("%nEnter per continuar");
        } while (Entrada.readLine().isEmpty());
    }
}

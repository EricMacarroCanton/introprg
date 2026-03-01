/*
Aquest exercici ens permetrà fer veure que hi ha una pilota que va caient en diagonal per la pantalla.

Abans que t'emocionis massa, recorda que estem en Java i tot ho estem executant des de terminal. És a dir, tindrem una animació discutiblement… animada.
*/
public class Pilota {

    public static final int N_FILES = 9;
    public static final int N_COLS = 13;

    public static void netejaPantalla() {
        // NOTA: La neteja de pantalla podria no funcionar fora del terminal.
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

    public static void netejaPosicio(char[][] camp, int fila, int col) {
        camp[fila][col] = '·';
    }

    public static void posicionaPilota(char[][] camp, int fila, int col) {
        camp[fila][col] = 'O';
    }

    public static int seguentFila(int filaActual) {
        if (filaActual < N_FILES - 1) {
            return filaActual + 1;
        } else {
            return 0;
        }
    }

    public static int seguentCol(int colActual) {
        if (colActual < N_COLS - 1) {
            return colActual + 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        char[][] camp = new char[N_FILES][N_COLS];
        netejaCamp(camp);
        int filaActual = 0;
        int colActual = 0;

        do {
            posicionaPilota(camp, filaActual, colActual);
            netejaPantalla();
            mostraCamp(camp);
            netejaPosicio(camp, filaActual, colActual);
            filaActual = seguentFila(filaActual);
            colActual = seguentCol(colActual);
            System.out.printf("%nEnter per continuar");
        } while (Entrada.readLine().isEmpty());
    }
}

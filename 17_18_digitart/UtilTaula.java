//En aquest exercici iniciarem el desenvolupament d'una biblioteca que anomenarem UtilTaula amb utilitats per manipular taules.
public class UtilTaula {

    public static char[][] substitueix(char[][] matriu, char cercat, char reemplaçament) {

        int totalFiles = matriu.length;
        int totalCols = matriu[0].length;

        char[][] matriuResultat = new char[totalFiles][totalCols];

        for (int fila = 0; fila < totalFiles; fila++) {
            for (int col = 0; col < totalCols; col++) {

                if (matriu[fila][col] == cercat) {
                    matriuResultat[fila][col] = reemplaçament;
                } else {
                    matriuResultat[fila][col] = matriu[fila][col];
                }
            }
        }

        return matriuResultat;
    }
}

//En aquest exercici, completaràs un programa que permet mostrar taules de diferents dimensions, amb totes les posicions inicialitzades amb un 1.
public class UtilTaula {

    public static void inicialitzaTaula(int[][] taula, int valor) {

        for (int f = 0; f < taula.length; f++) {
            for (int c = 0; c < taula[f].length; c++) {
                taula[f][c] = valor;
            }
        }
    }

    public static String taulaToString(int[][] taula) {

        String resultat = "";

        for (int f = 0; f < taula.length; f++) {

            for (int c = 0; c < taula[f].length; c++) {
                resultat += String.format("%8d", taula[f][c]);
            }

            resultat += "\n";
        }

        return resultat;
    }
}







//En aquest exercici, completaràs un programa que permet mostrar taules de diferents dimensions, amb totes les posicions inicialitzades amb un 1.

public class TaulaEnterAString {

    public static int obteFiles(String especificacio) {
        if (!especificacioCorrecta(especificacio)) return -1;
        String[] parts = especificacio.split("x");
        return Integer.parseInt(parts[0]);
    }

    public static int obteColumnes(String especificacio) {
        if (!especificacioCorrecta(especificacio)) return -1;
        String[] parts = especificacio.split("x");
        return Integer.parseInt(parts[1]);
    }

    public static void main(String[] args){

        for (int i=0; i<args.length; i++) {

            System.out.println(args[i]);

            int files = obteFiles(args[i]);
            int columnes = obteColumnes(args[i]);

            if (files < 1 || columnes < 1) {
                System.out.println("Especificació no vàlida");
            } else {

                int[][] taula  = new int[files][columnes];

                UtilTaula.inicialitzaTaula(taula, 1);

                String resultat = UtilTaula.taulaToString(taula);

                System.out.println(resultat);
                System.out.println();
            }
        }
    }

    public static boolean especificacioCorrecta(String especificacio) {

        String[] coordenades = especificacio.split("x");
        if (coordenades.length != 2) return false;

        for (int i=0; i<coordenades.length; i++) {
            if (! UtilString.esEnter(coordenades[i])) return false;

            int valor = Integer.parseInt(coordenades[i]);
            if (valor < 0 || valor > 99) return false;
        }

        return true;
    }
}



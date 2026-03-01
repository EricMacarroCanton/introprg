//En aquest exercici iniciarem el desenvolupament d'una biblioteca que anomenarem UtilTaula amb utilitats per manipular taules.

public class DigitArt {

    public static char[][] construeix1() {
        return new char[][] {
            {'·', '·', '·', '·', '·'},
            {'·', 'X', 'X', '·', '·'},
            {'·', '·', 'X', '·', '·'},
            {'·', '·', 'X', '·', '·'},
            {'·', '·', 'X', '·', '·'},
            {'·', 'X', 'X', 'X', '·'},
            {'·', '·', '·', '·', '·'}
        };
    }

    public static char[][] construeix2() {
        return new char[][] {
            {'·', '·', '·', '·', '·', '·'},
            {'·', 'X', 'X', 'X', 'X', '·'},
            {'·', '·', '·', '·', 'X', '·'},
            {'·', 'X', 'X', 'X', 'X', '·'},
            {'·', 'X', '·', '·', '·', '·'},
            {'·', 'X', 'X', 'X', 'X', '·'},
            {'·', '·', '·', '·', '·', '·'},
        };
    }

    public static char[][] construeix3() {
        return new char[][] {
            {'·', '·', '·', '·', '·', '·'},
            {'·', 'X', 'X', 'X', 'X', '·'},
            {'·', '·', '·', '·', 'X', '·'},
            {'·', 'X', 'X', 'X', 'X', '·'},
            {'·', '·', '·', '·', 'X', '·'},
            {'·', 'X', 'X', 'X', 'X', '·'},
            {'·', '·', '·', '·', '·', '·'},
        };
    }

    public static void mostraResultat(char[][] original, char[][] modificat) {

        for (int fila = 0; fila < original.length; fila++) {

            for (int col = 0; col < original[fila].length; col++) {
                System.out.print(original[fila][col]);
            }

            System.out.print(" -> ");

            for (int col = 0; col < modificat[fila].length; col++) {
                System.out.print(modificat[fila][col]);
            }

            System.out.println();
        }
    }

    public static void processaCaracter(char numero) {

        char[][] matriuOriginal;

        switch (numero) {
            case '1': matriuOriginal = construeix1(); break;
            case '2': matriuOriginal = construeix2(); break;
            case '3': matriuOriginal = construeix3(); break;
            default: return;
        }

        char[][] matriuModificada = UtilTaula.substitueix(matriuOriginal, 'X', numero);
        mostraResultat(matriuOriginal, matriuModificada);
        System.out.println();
    }

    public static void processaArgument(String argument) {

        for (int pos = 0; pos < argument.length(); pos++) {
            processaCaracter(argument.charAt(pos));
        }
    }

    public static void main(String[] args){

        if (args.length == 0) return;

        for (int argIndex = 0; argIndex < args.length; argIndex++) {
            processaArgument(args[argIndex]);
        }
    }
}

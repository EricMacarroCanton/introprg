//En aquest exercici implementarem el joc del tres en ratlla de manera que es pugui jugar.

//El joc començarà amb el tauler en blanc i anirà demanant moviments alternativament a cada jugador.
public class TresEnRatlla {

    public static void main(String[] args) {

        char[][] taulell = new char[3][3];
        for (int fila = 0; fila < taulell.length; fila++)
            for (int col = 0; col < taulell[fila].length; col++)
                taulell[fila][col] = '·';

        System.out.println("Comença el joc");

        char jugadorActual = 'X';

        while (true) {

            mostraTaulell(taulell);

            System.out.println(jugadorActual + "?");
            String entradaJugador = Entrada.readLine();

            if (entradaJugador.equalsIgnoreCase("a")) {
                System.out.println(jugadorActual + " abandona");
                break;
            }

            if (entradaJugador.length() != 2 ||
                entradaJugador.charAt(0) < '0' || entradaJugador.charAt(0) > '2' ||
                entradaJugador.charAt(1) < '0' || entradaJugador.charAt(1) > '2') {
                System.out.println("Coordenades no vàlides");
                continue; 
            }

            int filaSeleccionada = entradaJugador.charAt(0) - '0';
            int columnaSeleccionada = entradaJugador.charAt(1) - '0';

            if (casellaOcupada(taulell, filaSeleccionada, columnaSeleccionada)) {
                System.out.println("Casella ocupada");
                continue;
            }

            taulell[filaSeleccionada][columnaSeleccionada] = jugadorActual;

            if (jugadorGuanya(taulell, jugadorActual)) {
                mostraTaulell(taulell);
                System.out.println(jugadorActual + " guanya");
                break;
            }

            if (hiHaEmpat(taulell)) {
                mostraTaulell(taulell);
                System.out.println("Empat");
                break;
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }
    }

    public static void mostraTaulell(char[][] taulell) {
        for (int fila = 0; fila < taulell.length; fila++) {
            for (int col = 0; col < taulell[fila].length; col++) {
                System.out.print(taulell[fila][col]);
            }
            System.out.println();
        }
    }

    public static boolean casellaOcupada(char[][] taulell, int fila, int columna) {
        return taulell[fila][columna] != '·';
    }

    public static boolean jugadorGuanya(char[][] taulell, char jugador) {

        for (int idx = 0; idx < 3; idx++)
            if (taulell[idx][0] == jugador && taulell[idx][1] == jugador && taulell[idx][2] == jugador)
                return true;

        for (int idx = 0; idx < 3; idx++)
            if (taulell[0][idx] == jugador && taulell[1][idx] == jugador && taulell[2][idx] == jugador)
                return true;

        if (taulell[0][0] == jugador && taulell[1][1] == jugador && taulell[2][2] == jugador)
            return true;
        if (taulell[0][2] == jugador && taulell[1][1] == jugador && taulell[2][0] == jugador)
            return true;

        return false;
    }

    public static boolean hiHaEmpat(char[][] taulell) {
        for (int fila = 0; fila < 3; fila++)
            for (int col = 0; col < 3; col++)
                if (taulell[fila][col] == '·')
                    return false; 
        return true;
    }
}


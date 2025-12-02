//* exercici on hem de fer un programa que demani un nombre enter positiu i dibuixi horitzontalment tants rombos com se li indiqui:
public class RombosH {
    public static void main(String[] args) {
        System.out.println("quants?");
        int quants = Integer.parseInt(Entrada.readLine());
        if (quants >= 1) {

            // PARTE SUPERIOR
            for (int linea = 1; linea <= 10; linea++) { // Linea
                for (int cop = 1; cop <= quants; cop++) { // n de repeticiones

                    // Puntos Izquierda
                    for (int j = 0; j <= 9 - linea; j++) {
                        if (cop != 1 && j == 0) {
                            // compartimos el 0 central
                        } else {
                            System.out.print(".");
                        }
                    }

                    // Numeros Izquierda
                    for (int j = 10 - linea; j < 10; j++) {
                        if (cop != 1 && j == 0) {
                            // compartimos el 0 central
                        } else {
                            System.out.print(j);
                        }
                    }

                    // Numeros Derecha
                    for (int j = 8; j >= 10 - linea; j--) {
                        System.out.print(j);
                    }

                    // Puntos Derecha
                    for (int j = 0; j <= 9 - linea; j++) {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }

            // PARTE INFERIOR 
            for (int linea = 9; linea >= 1; linea--) { // empezamos en 9 para no repetir la línea 10
                for (int cop = 1; cop <= quants; cop++) {

                    // Puntos Izquierda
                    for (int j = 0; j <= 9 - linea; j++) {
                        if (cop != 1 && j == 0) {
                            // 0 central
                        } else {
                            System.out.print(".");
                        }
                    }

                    // Numeros Izquierda
                    for (int j = 10 - linea; j < 10; j++) {
                        if (cop != 1 && j == 0) {
                            //0 central
                        } else {
                            System.out.print(j);
                        }
                    }

                    // Numeros Derecha
                    for (int j = 8; j >= 10 - linea; j--) {
                        System.out.print(j);
                    }

                    // Puntos Derecha
                    for (int j = 0; j <= 9 - linea; j++) {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }

        }
    }
}


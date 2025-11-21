//* exercicic on hem de fer un programa que demani un enter entre 1 i 9, i "dibuixi" un quadrat amb els nombres del 1 fins el valor de l'entrada.

public class QuadratNombres {
    public static void main(String[] args) {
        System.out.println("Valor final?");
        int finals = Integer.parseInt(Entrada.readLine());

        if (finals < 1 || finals > 9) {
            System.out.println("Valor inadequat");
        } else {
            for (int fila = 0; fila < finals; fila++) {
                for (int columna = 0; columna < finals; columna++) {
                    System.out.print((columna + 1) + "");
                }
                System.out.println();
            }
        }
    }
}


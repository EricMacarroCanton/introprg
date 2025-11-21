/* programa on hem de fer un programa  que demani un enter entre el 1 i el 9.
   El programa escriurà una línia per nombre entre el 1 i el nombre introduït 
   (és a dir, decreixentment). A cada línia escriurà tots els nombres des del nombre
   corresponent a la línia fins al 1.
*/

public class TriangleInvertit {
    public static void main(String[] args) {
        

        System.out.println("Nombre?");
        int n = Integer.parseInt(Entrada.readLine());

        if (n < 1 || n > 9) {
            System.out.println("Valor inadequat");
        } else {
            for (int fila = n; fila >= 1; fila--) {
                for (int col = 1; col <= fila; col++) {
                    System.out.print(col);
                    if (col != fila) { // posa coma només si no és l'últim número
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
}
}


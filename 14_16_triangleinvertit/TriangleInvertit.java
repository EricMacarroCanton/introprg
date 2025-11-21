/* programa on hem de fer un programa  que demani un enter entre el 1 i el 9.
   El programa escriurà una línia per nombre entre el 1 i el nombre introduït 
   (és a dir, decreixentment). A cada línia escriurà tots els nombres des del nombre
   corresponent a la línia fins al 1.
*/
public class TriangleInvertit {
    public static void main(String[] args) {

        System.out.println("Nombre?");
        int finals = Integer.parseInt(Entrada.readLine());

        if (finals < 1) {
            System.out.println("Valor inadequat");
        } else {

            for (int fila = finals ; fila >= 1; fila--)
                for (int columna = fila; columna >= 1; columna--) {
                    System.out.print(columna);
                }

                System.out.println();
            }
        }
    }
}


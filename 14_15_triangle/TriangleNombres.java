/* programa on hem de fer un programa  que demani un enter entre el 1 i el 9.
 El programa escriurà una línia per nombre entre el 1 i el nombre introduït 
 (es a dir, creixentment).A cada línia escriurà tots els nombres des del nombre corresponent a 
 la línia fins al 1.
 */
public class TriangleNombres {
    public static void main(String[] args) {

        System.out.println("Nombre?");
        int finals = Integer.parseInt(Entrada.readLine());

        if (finals < 1 || finals > 9) {
            System.out.println("Valor inadequat");
        } else {
            for (int fila = 1 ; fila <= finals; fila++) {
                for (int columna = 1; columna >= 1; columna--) {
                    System.out.print(columna);
                }
                System.out.println();
            }
        }
    }
}


public class Triangle {
    public static void main(String[] args) {
        

        System.out.println("Nombre?");
        int n = Integer.parseInt(Entrada.readLine());

        if (n < 1 || n > 9) {
            System.out.println("Valor inadequat");
        } else {
            for (int fila = n; fila >= 1; fila--) {
                for (int col = 1; col <= fila; col++) {
                    System.out.print(col);
                    if (col != fila) { 
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
}
}


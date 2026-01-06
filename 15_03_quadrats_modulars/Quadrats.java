/*
 * Demana un nombre enter i dibuixa tants quadrats de 5x5 amb 'X' com indiqui. Ara però
 es cridarà un mòdul anomenat dibuixaQuadrat() que farà la feina de dibuixar les difents línies del quadrat fent servir dibuixaLinia()
 */
public class Quadrats {

    public static void main(String[] args) {
        dibuixaQuadrats();
    }

    // Demana el nombre de quadrats i els dibuixa
    public static void dibuixaQuadrats() {
        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());

        if (quants <= 0) {
            return;
        }

        for (int i = 1; i <= quants; i++) {
            dibuixaQuadrat();
            System.out.println(); // línia en blanc després de cada quadrat
        }
    }

    // Dibuixa un quadrat de 5x5 cridant dibuixaLinia() per cada fila
    public static void dibuixaQuadrat() {
        for (int fila = 0; fila < 5; fila++) {
            dibuixaLinia();
        }
    }

    // Dibuixa una línia del quadrat
    public static void dibuixaLinia() {
        System.out.print(" "); // espai inicial
        for (int col = 0; col < 5; col++) {
            System.out.print("X");
            if (col < 4) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


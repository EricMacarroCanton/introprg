/*
 * Demana un nombre enter i dibuixa tants quadrats de 5x5 amb 'X' com indiqui.
 * Si el nombre és 0 o negatiu, no dibuixa res. Ara pero el nombre s'ha de cridar desde un altre modul
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
            dibuixaUnQuadrat();
            System.out.println(); // línia en blanc després de cada quadrat
        }
    }

    // Dibuixa un quadrat de 5x5
    public static void dibuixaUnQuadrat() {
        for (int fila = 0; fila < 5; fila++) {
            dibuixaFila();
        }
    }

    // Dibuixa una fila del quadrat
    public static void dibuixaFila() {
        System.out.print(" ");
        for (int col = 0; col < 5; col++) {
            System.out.print("X");
            if (col < 4) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


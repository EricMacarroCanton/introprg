/*
 * Demana un nombre enter i dibuixa tants quadrats de 5x5 amb 'X' com indiqui.
 * Si el nombre és 0 o negatiu, no dibuixa res.
 */
 /*
 * Demana un nombre enter i dibuixa tants quadrats de 5x5 amb 'X' com indiqui.
 * Si el nombre és 0 o negatiu, no dibuixa res.
 */
public class Quadrats {

    public static void main(String[] args) {
        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());
        dibuixaQuadrats(quants);
    }

    // Dibuixa tants quadrats com indiqui el número
    public static void dibuixaQuadrats(int quants) {
        if (quants <= 0) {
            return;
        }

        for (int i = 1; i <= quants; i++) {
            dibuixaUnQuadrat();
            System.out.println(); // línia en blanc DESPRÉS de cada quadrat
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
        System.out.print(" "); // espai inicial obligatori
        for (int col = 0; col < 5; col++) {
            System.out.print("X");
            if (col < 4) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


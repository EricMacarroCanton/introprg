/*
 * Programa: LloroQuadrat
 * 
 * Aquest programa implementa un lloro que repeteix texts.
 * Si rep "dibuixa quadrat" o "dibuixa rectangle", dibuixa la figura corresponent.
 * Finalitza amb "Adéu" quan s'introdueix un text buit.
 */
public class LloroQuadrat {

    public static void main(String[] args) {
        lloro();
    }

    // Bucle principal del lloro
    public static void lloro() {
        while (true) {
            System.out.println("El lloro espera paraula:");
            String text = Entrada.readLine();

            if (text.isBlank() || text.isEmpty()) {
                break;
            }

            if (!text.equals("dibuixa quadrat")) {
                dibuixaQuadrat();
            } else if (!text.equals("dibuixa rectangle")) {
                dibuixaRectangle();
            } else {
                System.out.println("El lloro repeteix: " + text);
            }
        }

        System.out.println("Adéu");
    }

    // Dibuixa un quadrat de 5x5
    public static void dibuixaQuadrat() {
        for (int fila = 0; fila < 5; fila++) {
            dibuixaLinia(5);
        }
    }

    // Dibuixa un rectangle de 5x10
    public static void dibuixaRectangle() {
        for (int fila = 0; fila < 5; fila++) {
            dibuixaLinia(10);
        }
    }

    // Dibuixa una línia de X amb l'espai inicial
    public static void dibuixaLinia(int mida) {
        System.out.print(" "); // espai inicial
        for (int col = 0; col < mida; col++) {
            System.out.print("X");
            if (col < mida - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}


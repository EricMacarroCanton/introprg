/*
 * Programa: PiramideLletres
 *
 * Rep un text com a primer argument de la línia de comandes
 * i dibuixa una piràmide amb les seves lletres.
 */
public class PiramideLletres {

    public static void main(String[] args) {
        if (args.length < 1) {
            return;
        }

        String text = args[0];
        piramitza(text);
    }

    // Composa i mostra la piràmide
    public static void piramitza(String text) {
        int n = text.length();

        for (int i = 0; i < n; i++) {

            //  punts
            for (int p = 0; p < (n - i - 1) * 2 + 1; p++) {
                System.out.print(".");
            }

            //  lletres esq
            for (int j = 0; j <= i; j++) {
                System.out.print(text.charAt(j));
                if (j < i) {
                    System.out.print(".");
                }
            }

            //  lletres dre
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(".");
                System.out.print(text.charAt(j));
            }

            //  punts
            for (int p = 0; p < (n - i - 1) * 2 + 1; p++) {
                System.out.print(".");
            }

            System.out.println();
        }
    }
}



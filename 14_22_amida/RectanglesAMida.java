public class RectanglesAMida {
    public static void main(String[] args) {

        boolean continuar = true;
        int anterior = 1;   // files del primer rectangle
        int totalRectangles = 0;
        int totalPunts = 0;

        for (int k = 0; k < args.length && continuar; k++) {

            System.out.println(anterior + " x ?");
            String entrada = args[k];

            // cadena buida o només espais
            if (entrada.trim().isEmpty()) {
                continuar = false;
            } else {

                // --- COMPROVACIÓ MANUAL DEL NOMBRE ---
                boolean esNumero = true;
                for (int i = 0; i < entrada.length(); i++) {
                    char c = entrada.charAt(i);

                    if (i == 0 && c == '-') {
                        // signe negatiu permès
                    } else if (c < '0' || c > '9') {
                        esNumero = false;
                    }
                }

                if (!esNumero) {
                    continuar = false;
                } else {

                    // convertir a enter *sense try*
                    int num = 0;
                    int signe = 1;
                    int index = 0;

                    if (entrada.charAt(0) == '-') {
                        signe = -1;
                        index = 1;
                    }

                    for (; index < entrada.length(); index++) {
                        num = num * 10 + (entrada.charAt(index) - '0');
                    }
                    num *= signe;

                    if (num < 0) {
                        continuar = false;
                    } else {

                        int files = anterior;
                        int columnes = num;

                        // --- capçalera ---
                        System.out.print("   ");
                        for (int c = 0; c < columnes; c++) {
                            System.out.print(c % 10);
                        }
                        System.out.println();

                        // --- files ---
                        for (int f = 0; f < files; f++) {
                            System.out.print((f % 10) + " ");
                            for (int c = 0; c < columnes; c++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }

                        totalRectangles++;
                        totalPunts += files * columnes;

                        // preparar següent rectangle
                        anterior = num;
                    }
                }
            }
        }

        // --- RESULTAT FINAL ---
        if (totalRectangles == 0) {
            System.out.println("Cap rectangle dibuixat");
        } else {
            System.out.println("Rectangles: " + totalRectangles);
            System.out.println("Punts: " + totalPunts);
        }
    }
}


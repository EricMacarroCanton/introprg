public class RombosH {

    public static void main(String[] args) {

        System.out.println("quants?");
        int n = Integer.parseInt(Entrada.readLine());
        int h = 9;

        for (int fila = -h; fila <= h; fila++) {

            int espacios = (fila < 0) ? -fila : fila;
            int largo = h - espacios;

            // només imprimim si largo > 0 (així eliminem la fila superior i inferior)
            if (largo > 0) {

                for (int r = 0; r < n; r++) {

                    int primer = 10 - largo;

                    // punts esquerra
                    for (int i = 0; i <= espacios; i++)
                        System.out.print(".");

                    // números creixents
                    for (int i = primer; i <= 9; i++)
                        System.out.print(i);

                    // números decreixents
                    for (int i = 8; i >= primer; i--)
                        System.out.print(i);

                    // punts dreta
                    for (int i = 0; i < espacios; i++)
                        System.out.print(".");

                }

                System.out.println();
            }
        }
    }
}


public class SequenciaCreixent {
    public static void main(String[] args) {
        int numeroAnterior;
        int numeroActual;
        int comptador = 0;

        System.out.println("Introdueix un valor:");
        numeroAnterior = Integer.parseInt(Entrada.readLine());
        comptador++;

        boolean bucle = true;

        do {
            System.out.println("Introdueix un valor:");
            numeroActual = Integer.parseInt(Entrada.readLine());

            if (numeroActual > numeroAnterior) {
                comptador++;
                numeroAnterior = numeroActual; // només actualitzem si segueix creixent
            } else {
                bucle = false; // el bucle acabarà
            }

        } while (bucle); // <-- tanca aquí el do-while

        System.out.println("Longitud de la seqüència creixent: " + comptador);
    }
}


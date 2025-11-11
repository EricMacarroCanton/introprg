class SequenciaCreixent {
    public static void main(String[] args) {
        int numeroAnterior;
        int numeroActual;
        int comptador = 0;

        System.out.println("Introdueix un valor:");
        numeroAnterior = Integer.parseInt(Entrada.readLine());
        comptador++;

        do {
            System.out.println("Introdueix un valor:");
            numeroActual = Integer.parseInt(Entrada.readLine());

            if (numeroActual > numeroAnterior) {
                comptador++;
                numeroAnterior = numeroActual; // només actualitzem si segueix creixent
            }

            // Si numeroActual <= numeroAnterior, el bucle acabarà
        } while (numeroActual > numeroAnterior);

        System.out.println("Longitud de la seqüència creixent: " + comptador);
    }
}


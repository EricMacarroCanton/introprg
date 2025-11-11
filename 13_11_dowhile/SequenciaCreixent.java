class SequenciaCreixent {
    public static void main(String[] args) {
        int numeroAnterior;
        int numeroActual;
        int comptador = 0;

        System.out.println("Introdueix un valor:");
        numeroAnterior = Integer.parseInt(Entrada.readLine());
        comptador++;

        // Bucle do-while amb condició
        do {
            System.out.println("Introdueix un valor:");
            numeroActual = Integer.parseInt(Entrada.readLine());

            if (numeroActual > numeroAnterior) {
                comptador++;
            }

            // Actualitzem numeroAnterior només si la seqüència continua
            numeroAnterior = numeroActual;

        } while (numeroActual > numeroAnterior);

        System.out.println("Longitud de la seqüència creixent: " + comptador);
    }
}


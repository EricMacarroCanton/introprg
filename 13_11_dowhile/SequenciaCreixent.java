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
                System.out.println("Introdueix un valor:");
            numeroActual = Integer.parseInt(Entrada.readLine());
            }

 
            numeroAnterior = numeroActual;

        } while (numeroActual > numeroAnterior);

        System.out.println("Longitud de la seqüència creixent: " + comptador);
    }
}


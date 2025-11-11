class SequenciaCreixent {
    public static void main(String[] args) {
        int numeroAnterior = 0;
        int numeroActual;
        int comptador = 0;

       

        do {
            System.out.println("Introdueix un valor:");
            numeroActual = Integer.parseInt(Entrada.readLine());

            if (numeroActual > numeroAnterior) {
                comptador++;
                numeroAnterior = numeroActual; 
    
            }
        } while (numeroActual > numeroAnterior);

        System.out.println("Longitud de la seqüència creixent: " + comptador);
    }
}


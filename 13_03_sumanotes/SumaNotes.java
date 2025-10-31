public class SumaNotes {
    public static void main(String[] args) {
        int notafinal = 0;  

        while (true) { // bucle infinit fins que es compleixi la condició
            // demana el valor
            System.out.println("Introdueix una nota");
            int nota = Integer.parseInt(Entrada.readLine());

            
            notafinal = notafinal + nota;

            // comprova si la suma arriba a 100 o més
            if (notafinal >= 100) {
                System.out.println("La suma de les notes és " + notafinal);
                return; 
            }
        }
    }
}


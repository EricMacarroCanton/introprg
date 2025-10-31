public class SumaNotes {
    public static void main(String[] args) {
        int notafinal = 0;

        while (true) {
            System.out.println("Introdueix una nota");
            int nota = Integer.parseInt(Entrada.readLine());

            // si la nota és negativa, sortim del bucle
            if (nota < 0) {
                break;
            }

            // només sumem notes vàlides (0-100)
            if (nota <= 100) {
                notafinal += nota;
            }

            // si la suma arriba a 100 o més, sortim immediatament
            if (notafinal >= 100) {
                break;
            }
        }

        System.out.println("La suma de les notes vàlides és " + notafinal);
    }
}


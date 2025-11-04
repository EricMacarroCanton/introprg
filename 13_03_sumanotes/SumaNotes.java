/*
 * Programa: SumaNotes
 * Descripció: Aquest programa demana a l'usuari que introdueixi notes numèriques.
 * - Si la nota és negativa o superior a 100, el programa finalitza.
 * - Només s'acumulen les notes vàlides (entre 0 i 100).
 * - Si la suma total arriba a 100 o més, el programa també finalitza.
 * Finalment, mostra per pantalla la suma de les notes vàlides introduïdes.
 *
 * Autor: Eric Macarro
 */
public class SumaNotes {
    public static void main(String[] args) {
        int notafinal = 0;

        while (true) {
            System.out.println("Introdueix una nota");
            int nota = Integer.parseInt(Entrada.readLine());

            // Si la nota és negativa o superior a 100, sortim
            if (nota < 0 || nota > 100) {
                break;
            }

            // Suma les notes vàlides
            notafinal += nota;

            // Si la suma arriba a 100 o més, sortim immediatament
            if (notafinal >= 100) {
                break;
            }
        }

        System.out.println("La suma de les notes vàlides és " + notafinal);
    }
}


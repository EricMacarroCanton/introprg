/*
 * Programa: SumaNotes
 * Descripció: Aquest programa demana a l'usuari que introdueixi notes numèriques.
 * - Si la nota és negativa, el programa finalitza.
 * - Només s'acumulen les notes vàlides (entre 0 i 100).
 * - Si la nota és superior a 100, es descarta però es continua demanant més notes.
 * Finalment, mostra per pantalla la suma de les notes vàlides introduïdes.
 *
 * Autor: Eric Macarro
 */
public class SumaNotes {
    public static void main(String[] args) {

        int totalNotes = 0;       // suma → totalNotes
        int notaActual = 0;       // nota → notaActual

        // Demanem la primera nota
        System.out.println("Introdueix una nota");
        notaActual = Integer.parseInt(Entrada.readLine());

        while (notaActual >= 0 && notaActual <= 100) {
            totalNotes = totalNotes + notaActual;

            System.out.println("Introdueix una nota");
            notaActual = Integer.parseInt(Entrada.readLine());
        }

        System.out.println("La suma de les notes vàlides és " + totalNotes);
    }
}


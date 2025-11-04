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
        int sumaNotes = 0;

        System.out.println("Introdueix una nota");
        int nota = Integer.parseInt(Entrada.readLine());

        // Només sumem si la nota és vàlida (0–100)
        if (nota >= 0 && nota <= 100) {
            sumaNotes = nota;
        }

        System.out.println("La suma de les notes vàlides és " + sumaNotes);
    }
}


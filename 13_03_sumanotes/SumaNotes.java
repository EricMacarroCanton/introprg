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
        String linia;

        System.out.println("Introdueix una nota");
        while ((linia = Entrada.readLine()) != null) {
            int nota = Integer.parseInt(linia);

            if (nota < 0) break; // sortim si és negativa

            if (nota <= 100) {
                sumaNotes += nota;
            }

            System.out.println("Introdueix una nota");
        }

        System.out.println("La suma de les notes vàlides és " + sumaNotes);
    }
}


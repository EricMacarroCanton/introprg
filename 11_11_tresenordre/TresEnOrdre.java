/**
 * Nom del fitxer: TresEnOrdre.java
 * Autor: [El teu nom]
 * Data: 14/10/2025
 * Descripció:
 *   Aquest programa demana tres nombres enters a l'usuari
 *   i els mostra ordenats creixentment (de menor a major).
 
 */

public class TresEnOrdre {
    public static void main(String[] args) {


        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        System.out.println("Segon?");
        int segon= Integer.parseInt(Entrada.readLine());
        System.out.println("Tercer?");
        int tercer = Integer.parseInt(Entrada.readLine());

        int min, mid, max;

        if (primer <= segon && primer <= tercer) {
            min = primer;
            if (segon <= tercer) {
                mid = segon;
                max = tercer;
            } else {
                mid = tercer;
                max = segon;
            }
        } else if (segon <= primer && segon <= tercer) {
            min = segon;
            if (primer <= tercer) {
                mid = primer;
                max = tercer;
            } else {
                mid = tercer;
                max = primer;
            }
        } else {
            min = tercer;
            if (primer <= segon) {
                mid = primer;
                max = segon;
            } else {
                mid = segon;
                max = primer;
            }
        }


        System.out.println(min + ", " + mid + " i " + max);
    }
}


/*
 * Programa que indica si el número proporcionat com a primer argument
 * és parell o senar.
 * Si no s'especifica cap número, el resultat és indeterminat.
 */
public class ClassificaCaravana {
    public static void main(String[] args) {
        int preu = Integer.parseInt(args[0]);

        if (preu < 50000) {                     // Econòmica
            System.out.println("Econòmica");
        } else if (preu < 175000) {            // General
            System.out.println("General");
        } else {                                // Luxe
            System.out.println("Luxe");
        }
    }
}


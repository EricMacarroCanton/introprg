/*
 * Rep un nombre n com a argument.
 * Si n < 1, informa que no hi ha valors naturals creixents.
 * Si n ≥ 1, mostra tots els nombres del 1 fins a n.
 * Utilitza un bucle while per generar els valors.
 * Controla casos límits per garantir una sortida coherent.
 Eric Macarro
 */
public class Naturals {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        if (n < 1) {
            System.out.println("Cap valor creixent entre 1 i " + n);
        } else {
            int i = 1;
            while (i <= n) {  // només la condició aquí
                System.out.println(i);
                i++;          
            }
        }
    }
}


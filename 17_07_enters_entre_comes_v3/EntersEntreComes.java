/* Desenvolupa un programa que mostri tres enters separats per comes tenint en comptes que els tres valors es troben emmagatzemats en un array d'enters.

Exercici on hauràs de reemplaçar els valors que apareixen pel contingut corresponent:*/
public class EntersEntreComes {
    public static void main(String[] args) {

        System.out.println("Quants?");
        int quants = Integer.parseInt(Entrada.readLine());

        int[] numeros = new int[quants];
        int comptador = 1;

        for (int i = 0; i < quants; i++) {
            System.out.println("Valor " + comptador + "?");
            numeros[i] = Integer.parseInt(Entrada.readLine());
            comptador++;
        }

        // Imprimir valors separats per comes
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);

            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
    }
}



/* Desenvolupa un programa que mostri tres enters separats per comes tenint en comptes que els tres valors es troben emmagatzemats en un array d'enters.

Exercici on hauràs de reemplaçar els valors que apareixen pel contingut corresponent:*/
public class EntersEntreComes {
    public static void main(String[] args) {
        int[] numeros = new int[5];
	int comptador = 1;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor " + comptador + "?");
            numeros[i] = Integer.parseInt(Entrada.readLine());
            comptador++;
        }

        System.out.println(numeros);

    }
}

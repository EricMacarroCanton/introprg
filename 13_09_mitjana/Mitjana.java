/**
 * Programa Mitjana
 * 
 * Descripció:
 * Programa que demana a l’usuari una sèrie de notes (valors numèrics).
 * Quan s’introdueix una nota negativa, el programa mostra la nota mitjana
 * de totes les notes introduïdes fins aquell moment i finalitza l’execució.
 * 
 * Autor: (Eric Macarro)
 * Data: 10/11/2025
 */
public class Mitjana {
    public static void main(String[] args) {

        int suma = 0;
        int comptador = 0;

        System.out.println("Introdueix un valor");
        int nota = Integer.parseInt(Entrada.readLine());
 
        while (nota >= 0 && nota < 100) {
            suma = suma + nota;
            comptador++;

            System.out.println("Introdueix un valor");
            nota = Integer.parseInt(Entrada.readLine());
        }
      if (comptador == 0) {
            System.out.println("Cap nota vàlida introduïda");
        } else {
            double mitjana = (double) suma / comptador;
            System.out.println("La mitjana de notes vàlides és " + mitjana);
        }
    }
}


/**
 * Programa Estadistiques
 * Descripció:
 * Programa que demana a l’usuari enters positius de manera repetida.
 * Quan s’introdueix un nombre negatiu, el programa finalitza la càrrega
 * de dades i mostra diversos estadístics sobre els valors introduïts.
 * Autor: (Eric Macarro)
 */

public class Estadistiques {
public static void main (String [] args) {

   int maxim = 0;
   int minim =0;
   int valor;
   double mitjana;
   int comptador = 0;
   int suma = 0;
        System.out.println("Introdueix un valor");
        valor = Integer.parseInt(Entrada.readLine());

        while (valor >= 0) {
            suma = suma + valor;
            comptador++;
            if (valor > maxim) {
                maxim = valor;           
           }
            else if (valor < minim) {
                minim = valor;           
           } 
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
            comptador++;
        }
        mitjana = (double) suma / comptador;
        System.out.println("El màxim és " + maxim);
        System.out.println("El mínim és " + minim);
        System.out.println("La mitjana de les notes vàlides és " + mitjana);
         
    }
}







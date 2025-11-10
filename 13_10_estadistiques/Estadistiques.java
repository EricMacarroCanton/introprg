/**
/**
 * Programa Estadistiques
 * 
 * Descripció:
 * Programa que demana a l’usuari enters positius de manera repetida.
 * Quan s’introdueix un nombre negatiu, el programa finalitza la càrrega
 * de dades i mostra diversos estadístics sobre els valors introduïts.
 * 
 * Autor: (Eric Macarro)
 */
public class Estadistiques {
    public static void main(String[] args) {

        long suma = 0;
        int comptador = 0;
        int maxim = 0;
        int minim = 0;

        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());

        if (valor >= 0) {
           
            minim = valor;
        }

        while (valor >= 0) {
            suma = suma + valor;
            comptador++;

            if (valor > maxim) {
                maxim = valor;
            }
            if (valor < minim) {
                minim = valor;
            }

            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
        }

        
        if (comptador == 0) {
            System.out.println("Cap valor vàlid introduït");
        } else {
            double mitjana = (double) suma / comptador;
            System.out.println("Nombre de valors: " + comptador);
            System.out.println("Suma total: " + suma);
            System.out.println("Valor màxim: " + maxim);
            System.out.println("Valor mínim: " + minim);
            System.out.println("Mitjana: " + mitjana);
        }
    }
}







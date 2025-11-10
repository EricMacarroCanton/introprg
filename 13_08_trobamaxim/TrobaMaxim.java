/**
 * Programa TrobaMaxim
 * 
 * Descripció:
 * Programa que demana enters positius (incloent el zero) de manera repetida.
 * Quan l’usuari introdueix un nombre negatiu, el programa mostra el valor
 * màxim positiu introduït i finalitza l’execució.
 * Autor: (Eric Macarro)
 */
 public class TrobaMaxim {
 public static void main (String[] args) {
        int maxim = 0;
        int valor;

        System.out.println("Introdueix un valor:");
        valor = Integer.parseInt(Entrada.readLine());

        while (valor >= 0) {

            if (valor > maxim) {
                maxim = valor;
            }

            System.out.println("Introdueix un valor:");
            valor = Integer.parseInt(Entrada.readLine());
        }

        System.out.println("El màxim és" + maxim);
    }
}


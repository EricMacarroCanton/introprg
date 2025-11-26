/*
 * Nom del programa: QuantsParells
 * Descripció: Programa que demana enters positius de manera repetida.
 *              Quan l’usuari introdueix un nombre negatiu, el programa
 *              mostra quants dels valors introduïts són parells i finalitza.
 * Autor: (Eric Macarro) 
 * Data: 04/11/2025
 */
public class QuantsParells {
    public static void main(String[] args) {

        int comptadorParells = 0;
        int valor = 0; // inicialitzem per poder entrar al bucle

        // El bucle continua mentre el valor no sigui negatiu
        while (valor >= 0) {
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());

            if (valor >= 0 && valor % 2 == 0) {
                comptadorParells++;
            }
        }

        System.out.println("Nombre de parells introduïts: " + comptadorParells);
    }
}


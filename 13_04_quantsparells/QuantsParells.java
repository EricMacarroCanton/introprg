/*
 * Nom del programa: QuantsParells
 * Descripció: Programa que demana enters positius de manera repetida.
 *              Quan l’usuari introdueix un nombre negatiu, el programa
 *              mostra quants dels valors introduïts són parells i finalitza.
 * Autor: (Escriu el teu nom aquí)
 * Data: 04/11/2025
 */
public class QuantsParells {
    public static void main(String[] args) {

        int comptadorParells = 0; // Inicialitzem el comptador
        int valor;

        while (true) {
            System.out.println("Introdueix un valor:");
            valor = Integer.parseInt(Entrada.readLine());

            // Si és negatiu, sortim del bucle
            if (valor < 0) {
                break;
            }

            // Si és parell, incrementem el comptador
            if (valor % 2 == 0) {
                comptadorParells++;
            }
        }

        System.out.println("Has introduït " + comptadorParells + " valors parells.");
    }
}


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
        int valor;

while (true) {
	System.out.println("Introdueix un valor");
	valor = Integer.parseInt(Entrada.readLine());

            
if (valor < 0) {
	break;
            }

if (valor % 2 == 0) {
	comptadorParells++;
            }
        }

        System.out.println("Nombre de parells introduïts: " + comptadorParells);
    }
}


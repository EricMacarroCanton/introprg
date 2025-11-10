/**
 * Programa Mitjana
 * 
 * Descripció:
 * Programa que demana a l’usuari una sèrie de notes (valors numèrics).
 * Quan s’introdueix una nota negativa, el programa mostra la nota mitjana
 * de totes les notes introduïdes fins aquell moment i finalitza l’execució.
 * 
 * Autor: (Eric Macarro)
 */
public class Mitjana {
public static void main(String[] args) {
 
        int sumanotes = 0;
        int valor;
	double mitjana;
	int contador = 0;
        System.out.println("Introdueix un valor");
        valor = Integer.parseInt(Entrada.readLine());
        sumanotes = sumanotes + valor;
        contador++;
if (valor < 0 )
System.out.println("Cap nota vàlida introduïda");
contador--;
while (sumanotes < 100 ) {
System.out.println("Introdueix un valor");
	valor = Integer.parseInt(Entrada.readLine());
	sumanotes = sumanotes + valor;
	contador++;
			}
		mitjana = sumanotes / contador;
 System.out.println("La mitjana de les notes vàlides és " + mitjana);
		}
}

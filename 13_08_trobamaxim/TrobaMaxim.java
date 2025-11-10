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
	
System.out.println("Introdueix un valor");
int num = Integer.parseInt(Entrada.readLine());

if(num <= 0)
System.out.println("El màxim és 0");
while (num >= 0) {
     System.out.println("Introdueix un valor");
     num = Integer.parseInt(Entrada.readLine());
     if(num <= 0)
		System.out.println("El màxim és 0");
     
    
		}
	}
}
 

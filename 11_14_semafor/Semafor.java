/*
 * Programa: Semafor
 * Descripció: Aquest programa demana a l'usuari que introdueixi un color
 * (groc, vermell o verd) i mostra per pantalla una acció corresponent:
 *  - "groc" → "corre!"
 *  - "vermell" → "espera"
 *  - "verd" → "passa"
 * Si s’introdueix un color diferent, mostra el missatge "ves a l'oculista".
 * 
 * Autor: [Eric Macarro]
 */
 public class Semafor {
public static void main(String[] args) {
System.out.println("Color?");
String color = Entrada.readLine();
    if (color.equals("groc")) {
    System.out.println("corre!");
    } else if (color.equals("vermell")){
    System.out.println("espera");
    } else if (color.equals("verd")){
    System.out.println("passa");
    }else {
    System.out.println("ves a l'oculista");
    }





}
}
 

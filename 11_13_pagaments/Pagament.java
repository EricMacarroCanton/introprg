public class Pagament {
public static void main(String[] args) {
 
  System.out.println("Preu?");
  int preu = Integer.parseInt(Entrada.readLine());
  System.out.println("Paga?");
  int paga = Integer.parseInt(Entrada.readLine());
  
  int resultat = 0;
  
  if (paga > preu) {
       resultat = paga - preu;
       System.out.println("Sobren " + resultat + "€");
       } else if (paga == preu) {
       resultat = 0;
       System.out.println("No sobra ni falta res");
       } else if (paga < preu) {
       resultat = preu - paga;
        System.out.println("Falten " + resultat + "€");
         }
} 
  
}

public class Procedure {
    public static void main(String[] args) {

        int x = Integer.parseInt(Entrada.readLine());
        int y = Integer.parseInt(Entrada.readLine());
        mitjana(x, y);
         
  	 x = Integer.parseInt(Entrada.readLine());
         y = Integer.parseInt(Entrada.readLine());
        mitjana(x, y);
 	
      //  mitjana = (x + y) / 2.0;
      //  System.out.println("Mitjana = " + mitjana);

 	x = Integer.parseInt(Entrada.readLine());
        y = Integer.parseInt(Entrada.readLine());
        mitjana(x, y);

mitjana(8.33, 7.25);
       // mitjana = (x + y) / 2.0;
       // System.out.println("Mitjana = " + mitjana);
    }
public static double mitjanaD(int x,int y) {
        double resultat = (x + y) / 2.0;
        return resultat; 
    }
public static void mitjana(double x,double y) {
        double resultat = (x + y) / 2.0;
        System.out.println("Mitjana = " + resultat);  
}
}





public class Naturals {
public static void main (String [] args) {
        
      
            System.out.println("Has d'introduir un número com a argument.");
           
        

        // Convertim l'argument a enter
        int n = Integer.parseInt(args[0]);

        
        if (n < 1) {
            System.out.println("Cap valor creixent entre 1 i " + n);
        } else {
            int i = 1;
            while (i <= n) {
                System.out.println(i);
                i++;
            }
        }
    }
}


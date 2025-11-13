public class NaturalsParells {
public static void main (String [] args) {
        
 
        int n = Integer.parseInt(args[0]);

        
        if (n < 1) {
            System.out.println("Cap valor creixent entre 1 i " + n);
        } else {
            int i = 1;
            while (i <= n) {
                if ( i % 2 == 0 ) {
                System.out.println(i);
                i++;
              }  
            }
        }
    }
}

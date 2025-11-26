public class Rombos {

    public static void main(String[] args) {

        System.out.println("quants?");
        int n = Integer.parseInt(Entrada.readLine());


       
            for (int i = 1; i <= n; i++ ) {
           
              for (int lin = 1; lin <=10; lin++) { 
             
                for (int j = 0; j <= 9- lin; j++) {
                              System.out.print(".");
                }               
                for (int j = 10 - lin; j < 10; j++) { 
                              System.out.print(j);               
                }             
                for (int j = 8; j >= 10 - lin; j--) { 
                              System.out.print(j);               
                }                   
                for (int j = 0; j <= 9- lin; j++) {
                              System.out.print(".");
                                              
                }
                 System.out.println();    }
                for (int lin = 1; lin <=10; lin++) { 
             
                for (int j = 0; j <= 9- lin; j++) {
                              System.out.print(".");
                }               
                for (int j = 10 - lin; j < 10; j++) { 
                              System.out.print(j);               
                }             
                for (int j = 8; j >= 10 - lin; j--) { 
                              System.out.print(j);               
                }                   
                for (int j = 0; j <= 9- lin; j++) {
                              System.out.print(".");
                                              
                }       
                System.out.println();                         
              }            
              
        }
    }
}

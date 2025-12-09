public class MostraInterval {
    public static void main(String[] args) {
    
    
        System.out.println("text?");
	       	String text = Entrada.readLine();
        
        System.out.println("inici?");
	        int inici = Integer.parseInt(Entrada.readLine());
	        
        System.out.println("final?");
	        int finals = Integer.parseInt(Entrada.readLine());
	   if (inici < 0) inici = 0;
        if (inici >= text.length()) inici = text.length() - 1;
        if (finals < 0) finals = 0;
        if (finals >= text.length()) finals = text.length() - 1;

        // Recórrer l'interval
        if (inici >= finals) {
            for (int x = inici; x >= finals; x--) {
                char c = text.charAt(x);
                
                    System.out.println(c);
                }
            }
        } else {
            for (int x = inici; x <= finals; x++) {
                char c = text.charAt(x);
             
                    System.out.println(c);
                }
            }
        }
  


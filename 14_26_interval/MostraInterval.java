public class MostraInterval {
    public static void main(String[] args) {
    
    
        System.out.println("text?");
	       	String text = Entrada.readLine();
        
        System.out.println("inici?");
	        int inici = Integer.parseInt(Entrada.readLine());
	        
        System.out.println("final?");
	        int finals = Integer.parseInt(Entrada.readLine());
	 if (inici < 0 || inici >= text.length() || finals < 0 || finals >= text.length()) {
            System.out.println("Índex fora de rang!");
            }        
	        
	 if (inici >= finals) {
            for (int x = inici; x >= finals; x--) {
                char c = text.charAt(x);
                if (c != ' ') {  
                    System.out.println(c);
                }
            }
        } else {
            for (int x = inici; x <= finals; x++) {
                char c = text.charAt(x);
                if (c != ' ') {  
                    System.out.println(c);
                }
            }
        }
    }
}











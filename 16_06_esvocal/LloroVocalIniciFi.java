/*
*
*
*Considerarem com a vocals totes les variants d'accents i dièresis de les vocals catalanes. , à, è, é, í, ï, ò, ó, ú i ü.
*
*
*/
public class LloroVocalIniciFi {
    public static void main(String[] args) {
        
        int contador = 1;    
        boolean seguir = true;
        String entrada = "g";

        

        while (seguir) {
             
            System.out.println("Text?");
            entrada = Entrada.readLine();

            if (entrada.isBlank()) {
                System.out.println("Sortir?");
                entrada = Entrada.readLine();
                if (UtilitatsConfirmacio.respostaABoolean(entrada)) {
                    System.out.println("Adéu");
                    return;
                }
            } else {
                char primer = entrada.charAt(0);
                char ultim = entrada.charAt(entrada.length() - 1);
           
                
                if (UtilString.esVocal(primer) || UtilString.esVocal(ultim)) {
                    System.out.printf(" %2d: \"%s\"%n", contador, entrada);
                    contador++;
                }
        
            }
   
            

            
        
        }
    
    }


}

// programa on hem de fer que vagi demanant texts fins rebre la cadena buida i per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.
public class Enters {
    public static void main(String[] args) {

        System.out.println("Introdueix els texts a analitzar:");

        boolean seguit = true;

        while (seguit) {
            String enter = Entrada.readLine();

           
            if (enter.length() == 0) {
                System.out.println("Adéu");
                seguit = false;
            } else {
                boolean esEnter = true;
                int start = 0;

        
                boolean nomesEspais = true;
                for (int i = 0; i < enter.length(); i++) {
                    if (enter.charAt(i) != ' ') {
                        nomesEspais = false;
                    }
                }

                if (nomesEspais) {
                    esEnter = false;
                }

                // Comprovar signe inicial
                for (int g = 0; g < 1; g++) {
   			 char c = enter.charAt(g);
    
if (esEnter && (c == '+' || c == '-')) {

     			   if (enter.length() == 1) {
            			esEnter = false;
      			  } else {
        			    start = 1;
        }
    }
}


                // Recorregut
                for (int i = start; i < enter.length(); i++) {
                    esEnter = esEnter && Character.isDigit(enter.charAt(i));
                }

                // Mostrar resultat amb cometes
                if (esEnter) {
                    System.out.println("\"" + enter + "\" és enter");
                } else {
                    System.out.println("\"" + enter + "\" no és enter");
                }
            }
        }
    }
}




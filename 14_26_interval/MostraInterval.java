//exercici on hem de fer un programa que demani un text i dos valors enters, i que mostri tots els caràcters que hi ha entre el primer i el segon, en l'ordre marcat per l'entrada.
public class MostraInterval {
    public static void main(String[] args) {

        System.out.println("text?");
        String text = Entrada.readLine();

        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());

        System.out.println("final?");
        int finals = Integer.parseInt(Entrada.readLine());

        //  valors fora de rang
        if (inici < 0) inici = 0;
        if (inici >= text.length()) inici = text.length() - 1;
        if (finals < 0) finals = 0;
        if (finals >= text.length()) finals = text.length() - 1;

        
        if (inici >= finals) {
            for (int x = inici; x >= finals; x--) {
                System.out.println(text.charAt(x));
            }
        } else {  
            for (int x = inici; x <= finals; x++) {
                System.out.println(text.charAt(x));
            }
        }
    }
}
     
  


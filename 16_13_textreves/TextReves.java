// exercici on hem de desenvolupar una nova versió del programa TextReves d'un exercici anterior. En aquesta ocasió, la sortida saltarà els espais de l'entrada per fer més elegant el resultat. 
public class TextReves {
    public static void main(String[] args) {


        System.out.print("Text? ");
        String text = Entrada.readLine();

       
        String invertit = UtilString.inverteix(text);
        String cometejat = UtilString.cometeja(invertit);

        System.out.println(cometejat);
    }
}


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mitjana {

    public static void main(String[] args) throws IOException {
        String cami = "notes.csv";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);

        System.out.println("Càlcul de la mitjana de notes per 6 exàmens");

        String linia; 
        while ((linia = input.readLine()) != null) {	
            double mitjana = UtilString.esNumero(linia);
            
    while ((linia = input.readLine()) != null) {    
    System.out.printf("%s (%.2f)%n", UtilString.getNom(linia), mitjana);
}
    }
}
}

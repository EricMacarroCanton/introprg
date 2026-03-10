import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mitjana {

    public static void main(String[] args) throws IOException {
        String cami = "notes.csv";
        BufferedReader input = new BufferedReader(new FileReader(cami));

        // Ignora la primera línia (capçalera)
        input.readLine();

        System.out.println("Càlcul de la mitjana de notes per 6 exàmens");

        String linia; 
        while ((linia = input.readLine()) != null) {    
            String nom = UtilString.getNom(linia);
            double mitjana = UtilString.esNumero(linia);
            System.out.printf("%s (%.2f)%n", nom, mitjana);
        }

        input.close();
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mitjana {

    public static void main(String[] args) throws IOException {
        String cami = "notes.csv";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);

        input.readLine();

      System.out.println("Càlcul de la mitjana de notes per 6 exàmens");
       int contador = 0;
       String linia; 
       while ((linia = input.readLine()) != null) {
   		 if (contador == 0) {
        		contador++; 
        		continue;
    }
    System.out.println(UtilString.esNumero(linia));
}
input.close();

        

        }
    }



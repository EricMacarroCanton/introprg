import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mitjana {

    public static void main(String[] args) throws IOException {
        String cami = "notes.csv";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);

        input.readLine();

        String linia = input.readLine();
        int contador = 0;
        while (true) {
            if (contador == 0) {
                contador++;
            } else {
                System.out.println(UtilString.esNumero(linia));
            }
        }

        

        }
    }



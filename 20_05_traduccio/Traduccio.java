//En aquest exercici desenvoluparem un programa que rebrà tres arguments per línia de comandes.
//El programa escriurà en la destinació el contingut de l'origen pel que haurà reemplaçat les aparicions de les claus pels corresponents valors.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class Traduccio {

    public static void main(String[] args) throws IOException {

        String origen = "fitxerOrigen.txt";
        String traduccio = "fitxerTraduccio.txt";
        String desti = "fitxerDestinacio.txt";

        Traduccio r = new Traduccio();
        r.tradueix(origen, traduccio, desti);
    }

    public void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fitxerOrigen));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fitxerDestinacio));
        
   	String linia = br.readLine(); 
   	
        while (linia != null) {
            linia = tradueixLinia(linia, fitxerTraduccio);
            bw.write(linia);
            bw.newLine();
        }

        br.close();
        bw.close();
    }

    public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fitxerTraduccio));
   	String trad = br.readLine(); 

        while (trad != null) {
            String[] parts = trad.split(",");

            if (parts.length == 2) {
                linia = linia.replace(parts[0], parts[1]);
            }
        }

        br.close();
        return linia;
    }
}

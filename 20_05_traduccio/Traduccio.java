//En aquest exercici desenvoluparem un programa que rebrà tres arguments per línia de comandes.
//El programa escriurà en la destinació el contingut de l'origen pel que haurà reemplaçat les aparicions de les claus pels corresponents valors.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class Traduccio {
	 int contador = 0;
    public static void main(String[] args) throws IOException {

        String origen = "origen.txt";
        String traduccio = "traduccio.csv";
        String desti = "fitxerdestinacio.txt";

        Traduccio r = new Traduccio();
        r.tradueix(origen, traduccio, desti);
    }

    public void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fitxerOrigen));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fitxerDestinacio));
        
   	String linia = br.readLine(); 
   	
        while (linia != null) {
         	if (linia.isEmpty()) { 
         	System.out.println("Cal especificar els fitxers origen, traduccio i destinació");
            break;
            }

       
        linia = normalitzaBlancs(linia);

        System.out.println("El lloro registra: " + linia);
        bw.write(linia);
        bw.newLine();

        contador++;
    }

    bw.close();
}
    public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException {

       
    return "patata";
     }
    
    
    public String normalitzaBlancs(String text) {
        if (text == null) return null;

        String resultat = "";
        boolean anteriorEspai = true;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c != ' ') {
                resultat = resultat + c;
                anteriorEspai = false;
            } else {
                if (!anteriorEspai) {
                    resultat = resultat + c;
                    anteriorEspai = true;
                }
            }
        }

        int start = 0;
        while (start < resultat.length() && resultat.charAt(start) == ' ') start++;

        int end = resultat.length() - 1;
        while (end >= start && resultat.charAt(end) == ' ') end--;

        String finalResult = "";
        for (int i = start; i <= end; i++) {
            finalResult = finalResult + resultat.charAt(i);
        }

        return finalResult;
    }
}


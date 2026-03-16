//En aquest exercici desenvoluparem un programa que rebrà tres arguments per línia de comandes.
//El programa escriurà en la destinació el contingut de l'origen pel que haurà reemplaçat les aparicions de les claus pels corresponents valors.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Traduccio {

    public static void main(String[] args) throws IOException {

        if (args.length != 3) {
            System.out.println("Cal especificar els fitxers origen, traduccio i destinació");
            return;
        }

        String origen = args[0];
        String traduccio = args[1];
        String desti = args[2];

        Traduccio t = new Traduccio();
        t.tradueix(origen, traduccio, desti);
    }

    public void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fitxerOrigen));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fitxerDestinacio));

        String linia = br.readLine();

        while (linia != null) {

            String novaLinia = tradueixLinia(linia, fitxerTraduccio);

            bw.write(novaLinia);
            bw.newLine();

            linia = br.readLine();
        }

        br.close();
        bw.close();
    }

  public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException {

    BufferedReader br = new BufferedReader(new FileReader(fitxerTraduccio));
    String fila = br.readLine();

    while (fila != null) {

        String[] parts = fila.split(",");

        if (parts.length == 2) {

            String clau = parts[0];
            String valor = parts[1];


            while (valor.length() > 0 && valor.charAt(0) == ' ') {
                valor = valor.substring(1);
            }

            linia = linia.replace(clau, valor);
        }

        fila = br.readLine();
    }

    br.close();
    return linia;
}
}

/* Al llarg d'aquest curs hem fet servir el patró del lloro en multitud d'ocasions. Aquest patró ens va bé quan hem de recorrer una seqüència de valors de la que no coneixem la longitud però sí una marca de finalització.*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Recorda {

         public static void main(String[] args) throws IOException {
        String cami = "records.txt";
        processaEntrada(cami);
        System.out.println("D'acord");
        mostraRecords(cami);
    }

    public static void processaEntrada(String cami) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter(cami, true)); // append

        while (true) {
            System.out.println("El lloro pregunta paraula:");
            String linia = sc.nextLine();

            if (linia.isEmpty()) { 
                break;
            }

            System.out.println("El lloro registra: " + linia);
            bw.write(linia);
            bw.newLine();
        }

        bw.close();
    }

    public static void mostraRecords(String cami) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(cami));
        String linia;



        while ((linia = br.readLine()) != null) {
            System.out.println("El lloro recorda " + linia);
        }

        br.close();
    }
}

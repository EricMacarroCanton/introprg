/* Al llarg d'aquest curs hem fet servir el patró del lloro en multitud d'ocasions. Aquest patró ens va bé quan hem de recorrer una seqüència de valors de la que no coneixem la longitud però sí una marca de finalització.*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Recorda {

    // Variable estàtica per saber si s'ha registrat alguna línia
    static int contador = 0;

    public static void main(String[] args) throws IOException {
        String cami = "records.txt";

        processaEntrada(cami);
        System.out.println("D'acord");
        mostraRecords(cami);
    }


    public static void processaEntrada(String cami) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter(cami, true)); 

        while (true) {
            System.out.println("El lloro pregunta paraula:");
            String linia = sc.nextLine();

            if (linia.isEmpty()) { 
                break;
            }

            System.out.println("El lloro registra: " + linia);
            bw.write(linia);
            bw.newLine();

            contador++;
        }

        bw.close();
    }


    public static void mostraRecords(String cami) throws IOException {
        if (contador == 0) {
            System.out.println("El lloro no recorda res");
            System.out.println("Adéu");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(cami));

        String linia = br.readLine(); 

        while (linia != null) {
            System.out.println("El lloro recorda: " + linia);
            linia = br.readLine(); 
        }

        System.out.println("Adéu");
        br.close();
    }
}

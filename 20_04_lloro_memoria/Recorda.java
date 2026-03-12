/* Al llarg d'aquest curs hem fet servir el patró del lloro en multitud d'ocasions. Aquest patró ens va bé quan hem de recorrer una seqüència de valors de la que no coneixem la longitud però sí una marca de finalització.*/
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Recorda {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter("arxiu.txt", true));

        String linia;

        while (true) {
            linia = sc.nextLine();

            if (linia.isEmpty()) {
                break;
            }

            bw.write(linia);
            bw.newLine();
        }

        bw.close();
    }
}

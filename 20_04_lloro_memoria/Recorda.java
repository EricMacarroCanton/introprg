/* Al llarg d'aquest curs hem fet servir el patró del lloro en multitud d'ocasions. Aquest patró ens va bé quan hem de recorrer una seqüència de valors de la que no coneixem la longitud però sí una marca de finalització.*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Recorda {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Recorda r = new Recorda();

        String linia;

        while (true) {
        System.out.println("El lloro pregunta paraula:");
            linia = sc.nextLine();
	 System.out.println("El lloro registra" + linia);

            if (linia.isEmpty()) {
                break;
            }

            r.processaEntrada(linia);
        }
    }

    public void processaEntrada(String linia) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("arxiu.txt", true));
        bw.write(linia);
        bw.newLine();
        bw.close();
    }
    	public void mostraRecords(String linia) {
    	}
}



/*Quan executem programes complexos, sol ser interessant poder registrar les situacions significatives que es van produint. Això ens permet a posteriori entre altres coses, auditar com s'ha executat, descobrir i reproduir errors.

Aquests registres es solen guardar en un fitxer de text amb una o més línies que descriuen què ha passat i sovint quan va passar. A aquest fitxer se'l sol conèixer com a fitxer de log.*/
import java.io.FileWriter;
import java.io.IOException;

public class UsaLog {
    public static void main(String[] args) throws IOException {
        Log.printError("Aquest és un error greu");
        Log.printInfo("Inici de la prova");

    }

    public static class Log {

        public static int comptador = 1;

        public static void reset() {
            comptador = 1;
        }

        public static String printError(String missatge) throws IOException {
            String linia = "[" + comptador + "] ERROR: " + missatge;
            FileWriter fw = new FileWriter("log.txt", true);
            fw.write(linia + "\n");
            fw.close();
            comptador++;
            return linia;
        }

        public static String printInfo(String missatge) throws IOException {
            String linia = "[" + comptador + "] INFO: " + missatge;
            FileWriter fw = new FileWriter("log.txt", true);
            fw.write(linia + "\n");
            fw.close(); 
            comptador++;
            return linia;
        }


    }
}

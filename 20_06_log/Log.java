/*Quan executem programes complexos, sol ser interessant poder registrar les situacions significatives que es van produint. Això ens permet a posteriori entre altres coses, auditar com s'ha executat, descobrir i reproduir errors.

Aquests registres es solen guardar en un fitxer de text amb una o més línies que descriuen què ha passat i sovint quan va passar. A aquest fitxer se'l sol conèixer com a fitxer de log.*/
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Log {
	
	// Variables
    public static String nomFitxer = "log.txt";
	public static int numLinia = 1;

    public static void reset() {
        numLinia = 1;
    }

    public static String printError(String text) throws IOException {   
        String registre = "[" + numLinia + "] ERROR: " + text;

        BufferedWriter escriptor = new BufferedWriter(new FileWriter(nomFitxer, true));
        escriptor.write(registre);
        escriptor.newLine();
        escriptor.close();

        numLinia++;
        return registre;
    }


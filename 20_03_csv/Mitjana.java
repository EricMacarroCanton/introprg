/* Els fitxers de text poden presentar diferents formats. Un de molt típic és el conegut com a csv que són les sigles de Comma Separated Values o en el nostre idioma Valors Separats per Comes.

Un fitxer csv, en la seva forma més bàsica, és una seqüència de línies de text on cada línia presenta un o més valors separats per un caràcter especial, habitualment la coma ,.

És un format molt típic perquè representa molt eficientment dades en forma tabular com les que s'emmagatzemen a una taula d'una base de dades relacional, o a un full de càlcul*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mitjana {

    public static void main(String[] args) throws IOException {

        String cami = "notes.csv";
        BufferedReader input = new BufferedReader(new FileReader(cami));

        // Ignora la primera línia (capçalera)
        input.readLine();

        int numExamens = 6;

	if (args.length > 0) {
   		 String arg = args[0];
    		boolean esNumero = true;
    for (int i = 0; i < arg.length(); i++) {
        if (!Character.isDigit(arg.charAt(i))) {
            esNumero = false;
            break;
        }
    }
    if (esNumero) {
        numExamens = Integer.parseInt(arg);
    }
    
}
	if (numExamens < 2) {
    System.out.println("Com a mínim 2 exàmens.");
    
    return; 
}


        System.out.println("Càlcul de la mitjana de notes per " + numExamens + " exàmens");

        String linia;
        int comptador = 0;

        while ((linia = input.readLine()) != null) {

            if (!linia.isBlank()) {

                linia = UtilString.normalitzaBlancs(linia);

                String nom = UtilString.getNom(linia);

                if (nom.length() > 0) {

                    double mitjana = UtilString.esNumero(linia, numExamens);
                    System.out.printf("%s (%.2f)%n", nom, mitjana);
                    comptador++;
                }
            }
        }

        if (comptador == 0) {
            System.out.print("El fitxer notes.csv no conté cap nota.");
        }

        input.close();
    }
}


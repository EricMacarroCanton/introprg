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


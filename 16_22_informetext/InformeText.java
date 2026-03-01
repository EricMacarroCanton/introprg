//Desenvolupa un programa anomenat InformeText que demani un text i mostri un petit informe resum d'estadístiques del text.
public class InformeText {
    public static void main(String[] args) {

        System.out.println("Text?");
        String cadenaEntrada = Entrada.readLine();

        // Entrada buida
        if (cadenaEntrada.isBlank()) {
            System.out.println("Cadena buida");
            return;
        }

        int totalCaracters = cadenaEntrada.length();
        int numMajuscules = UtilString.numLletresMajuscules(cadenaEntrada);
        int numMinuscules = UtilString.numLletresMinuscules(cadenaEntrada);
        int totalLletres = UtilString.numLletres(cadenaEntrada);
        int vocalsMajus = UtilString.numVocalsMajuscules(cadenaEntrada);
        int vocalsMinus = UtilString.numVocalsMinuscules(cadenaEntrada);
        int totalVocals = vocalsMajus + vocalsMinus;
        int numDigits = UtilString.numDigits(cadenaEntrada);
        int altresCaracters = totalCaracters - totalLletres - numDigits;

        System.out.println("Informe");
        System.out.println("=======");

        System.out.printf("lletres en majúscules: %d (%.2f%%)%n",
                numMajuscules, 100.0 * numMajuscules / totalCaracters);

        System.out.printf("lletres en minúscules: %d (%.2f%%)%n",
                numMinuscules, 100.0 * numMinuscules / totalCaracters);

        System.out.printf("total lletres: %d (%.2f%%)%n",
                totalLletres, 100.0 * totalLletres / totalCaracters);

        System.out.printf("vocals en majúscules: %d (%.2f%%)%n",
                vocalsMajus, 100.0 * vocalsMajus / totalCaracters);

        System.out.printf("vocals en minúscules: %d (%.2f%%)%n",
                vocalsMinus, 100.0 * vocalsMinus / totalCaracters);

        System.out.printf("total vocals: %d (%.2f%%)%n",
                totalVocals, 100.0 * totalVocals / totalCaracters);

        System.out.printf("digits: %d (%.2f%%)%n",
                numDigits, 100.0 * numDigits / totalCaracters);

        System.out.printf("altres caràcters: %d (%.2f%%)%n",
                altresCaracters, 100.0 * altresCaracters / totalCaracters);

        System.out.printf("total caràcters: %d%n", totalCaracters);
    }
}

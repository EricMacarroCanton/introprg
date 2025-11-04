/**
 * Programa LloroVocalIniFi
 * Demana paraules i només repeteix aquelles que comencen i acaben amb la mateixa vocal
 * (a, e, i, o, u), sense distingir entre majúscules o minúscules.
 * El programa acaba quan l'usuari introdueix una cadena buida o només amb espais.
 */
/**
 * Programa LloroVocalIniFi
 * Demana paraules i només repeteix aquelles que comencen i acaben amb la mateixa vocal
 * (a, e, i, o, u), sense distingir majúscules ni minúscules.
 * Finalitza quan s’introdueix una cadena buida o només amb espais.
 */
public class LloroVocalIniFi {
    public static void main(String[] args) {

        String paraula;

        while (true) {
            System.out.println("Paraula?");
            paraula = Entrada.readLine();

           
            if (paraula.trim().isEmpty()) {
                System.out.println("Adéu");
                break;
            }

           
            String text = paraula.trim().toLowerCase();

            char primera = text.charAt(0);
            char darrera = text.charAt(text.length() - 1);

  
            if ((primera == 'a' || primera == 'e' || primera == 'i' || primera == 'o' || primera == 'u') &&
                primera == darrera) {
                System.out.println("Repeteixo: " + paraula);
            }
        }
    }
}


/**
 * Programa LloroVocalIniFi
 * Demana paraules i només repeteix aquelles que comencen i acaben amb la mateixa vocal
 * (a, e, i, o, u), sense distingir majúscules ni minúscules.
 * Finalitza quan s’introdueix una cadena buida o només amb espais. 
 Eric Macarro
 */
public class LloroVocalIniFi { 
    public static void main(String[] args) { 
        System.out.println("Paraula?"); 
        String paraula = Entrada.readLine(); 

        while (!paraula.isEmpty()) { 
            char primera = paraula.charAt(0); 
            char darrera = paraula.charAt(paraula.length() - 1); 

            boolean mateixaVocal = 
                (primera == 'a' && (darrera == 'a' || darrera == 'A')) ||
                (primera == 'A' && (darrera == 'a' || darrera == 'A')) ||
                (primera == 'e' && (darrera == 'e' || darrera == 'E')) ||
                (primera == 'E' && (darrera == 'e' || darrera == 'E')) ||
                (primera == 'i' && (darrera == 'i' || darrera == 'I')) ||
                (primera == 'I' && (darrera == 'i' || darrera == 'I')) ||
                (primera == 'o' && (darrera == 'o' || darrera == 'O')) ||
                (primera == 'O' && (darrera == 'o' || darrera == 'O')) ||
                (primera == 'u' && (darrera == 'u' || darrera == 'U')) ||
                (primera == 'U' && (darrera == 'u' || darrera == 'U'));

            if (mateixaVocal) {
                System.out.println("Repeteixo: " + paraula); 
            } 

            System.out.println("Paraula?"); 
            paraula = Entrada.readLine(); 
        } 

        System.out.println("Adéu"); 
    } 
}


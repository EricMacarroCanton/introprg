/*
 * Aquest programa demana dos operands i un operador binari (+, -, * o /)
 * i mostra el resultat del càlcul corresponent
 */

public class CalculadoraSenzilla {
    public static void main(String[] args) {
        System.out.println("Operand 1?");
        double operand1 = Double.parseDouble(Entrada.readLine());

        System.out.println("Operador?");
        char operador = Entrada.readLine().charAt(0);

        System.out.println("Operand 2?");
        double operand2 = Double.parseDouble(Entrada.readLine());

        double resultat = 0;

        if (operador == '+') {
            resultat = operand1 + operand2;
        } else if (operador == '-') {
            resultat = operand1 - operand2;
        } else if (operador == '*') {
            resultat = operand1 * operand2;
        } else if (operador == '/') {
            if (operand2 == 0) {
                System.out.println("No es pot dividir entre 0");
                return;
            }
            resultat = operand1 / operand2;
        } else {
            System.out.println("L'operador " + operador + " no està disponible");
        
        }

        // Escriure resultat de manera senzilla
        System.out.println(operand1 + " " + operador + " " + operand2 + " = " + resultat);
    }
}


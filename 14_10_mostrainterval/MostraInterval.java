/** exercici on hem de demanar dos valors enters i mostrar tots els enters que hi ha entre els valors
Eric Macarro
*/
public class MostraInterval {
    public static void main(String[] args) {
        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());

        System.out.println("final?");
        int finals = Integer.parseInt(Entrada.readLine());

        if (inici <= finals) {
            for (int variable = inici; variable <= finals; variable++) {
                System.out.println(variable);
            }
        } else { 
            for (int variable = inici; variable >= finals; variable--) {
                System.out.println(variable);
            }
        }
    }
}


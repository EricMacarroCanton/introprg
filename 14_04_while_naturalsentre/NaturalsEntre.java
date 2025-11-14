public class NaturalsEntre {
    public static void main(String[] args) {


        System.out.println("Valor inicial?");
        int inicial = Integer.parseInt(Entrada.readLine());

    
        if (inicial < 0) {
            System.out.println("Valor no vàlid");
            
        }

        System.out.println("Valor final?");
        int finalValor = Integer.parseInt(Entrada.readLine());

       
        if (finalValor < 0 || finalValor < inicial) {
            System.out.println("Valor no vàlid");
           
        }

        System.out.println("Salt?");
        int salt = Integer.parseInt(Entrada.readLine());

       
        if (salt <= 0) {
            System.out.println("Valor no vàlid");
          
        }

        // Si tot és correcte, imprimim els valors
        int valor = inicial;
        while (valor <= finalValor) {
            System.out.println(valor);
            valor += salt;
        }
    }
}


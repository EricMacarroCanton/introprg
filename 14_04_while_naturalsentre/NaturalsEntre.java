public class NaturalsEntre {
    public static void main(String[] args) {

        boolean error = false;

        System.out.println("Valor inicial?");
        int inicial = Integer.parseInt(Entrada.readLine());

        if (inicial < 0) {
            System.out.println("Valor no vàlid");
            error = true;
        }

        int finalValor = 0;
        if (!error) {
            System.out.println("Valor final?");
            finalValor = Integer.parseInt(Entrada.readLine());

            if (finalValor < 0 || finalValor < inicial) {
                System.out.println("Valor no vàlid");
                error = true;
            }
        }

        int salt = 0;
        if (!error) {
            System.out.println("Salt?");
            salt = Integer.parseInt(Entrada.readLine());

            if (salt <= 0) {
                System.out.println("Valor no vàlid");
                error = true;
            }
        }

        // Només imprimeix si NO hi ha error
        if (!error) {
            int valor = inicial;
            while (valor <= finalValor) {
                System.out.println(valor);
                valor += salt;
            }
        }
    }
}


public class LletresInterval {
    public static void main(String[] args) {
        System.out.println("lletra?");
        String entradaLletra = Entrada.readLine();

   
        if (entradaLletra.length() != 1) {
            System.out.println("ERROR: Cal especificar una única lletra");
            return;
        }

        char lletra = entradaLletra.charAt(0);

     
        if (!Character.isLetter(lletra)) {
            System.out.println("Error: No és una lletra vàlida");
            return;
        }

        System.out.println("quantes?");
        int quantes = Integer.parseInt(Entrada.readLine());

      
        if (quantes < 1) {
            System.out.println("Error: El nombre de lletres ha de ser almenys 1");
            return;
        }


        char inici;
        boolean esMinuscula = Character.isLowerCase(lletra);
        if (esMinuscula) {
            inici = 'a';
        } else {
            inici = 'A';
        }

      
        for (int i = 0; i < quantes; i++) {
            char actual = (char)(lletra + i);
            // Ajustar si sobrepassa la 'z' o 'Z'
            if (esMinuscula && actual > 'z') {
                actual = (char)(inici + (actual - 'z' - 1));
            } else if (!esMinuscula && actual > 'Z') {
                actual = (char)(inici + (actual - 'Z' - 1));
            }
            System.out.print(actual);
        }
        System.out.println();
    }
}


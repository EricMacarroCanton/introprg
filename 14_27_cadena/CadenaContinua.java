public class CadenaContinua {
    public static void main(String[] args) {

        System.out.println("Text?");
        String text = Entrada.readLine();

      
        if (text.isBlank()) {
            System.out.println("ERROR: el text no conté caràcters no blancs");
        } else { 
            System.out.println("Nombre?");
            int nombre = Integer.parseInt(Entrada.readLine());

            if (nombre >= 1) { 
                int longi = text.length();

                for (int i = 0; i < nombre; i++) {
                    System.out.print(text.charAt(i % longi));
                }
            }
        }
    }
}


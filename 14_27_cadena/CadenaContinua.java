public class CadenaContinua {
    public static void main(String[] args) {

        System.out.println("text?");
        String text = Entrada.readLine();

        boolean dadesCorrectes = true;

        // Comprovació: text buit
        if (text.isBlank()) {
            dadesCorrectes = false;
        }

        System.out.println("Nombre?");
        int nombre = Integer.parseInt(Entrada.readLine());

        // Comprovació: nombre negatiu
        if (nombre < 0) {
            System.out.println("Error: El nombre no pot ser negatiu.");
            dadesCorrectes = false;
        }

        // Només executem si tot és correcte
        if (dadesCorrectes) {

            int longi = text.length();
            int numcops = nombre / longi;
            int residu = nombre % longi;

            for (int x = 0; x < numcops; x++) {
                System.out.print(text);
            }

            for (int y = 0; y < residu; y++) {
                System.out.print(text.charAt(y));
            }
        }
    }
}


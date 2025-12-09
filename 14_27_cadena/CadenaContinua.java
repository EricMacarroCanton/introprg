public class CadenaContinua {
    public static void main(String[] args) {

        System.out.println("text?");
        String text = Entrada.readLine();

        System.out.println("Nombre?");
        int nombre = Integer.parseInt(Entrada.readLine());
        int longi = text.length();
        int numcops = nombre / longi;
        int residu = nombre % longi;
        if (nombre < 0 || longi < 0) {

                System.out.println();

        } else {  // Si nombre > 0, imprimim
            for (int x = 0; x < numcops; x++) {
                    System.out.print(text);
            }
            for (int y = 0; y < residu; y++) {
                System.out.print(text.charAt(y));
            }
        }
    }
}


public class Enter {
    public static void main(String[] args) {

        System.out.println("Introdueix els texts a analitzar:");
        String enter = Entrada.readLine();
        boolean esEnter = true;
        int longi = enter.length();
        int start = 0;

        if (enter.startsWith("-") || enter.startsWith("+")) {
            if (enter.length() == 1) esEnter = false;
            start = 1;
        }
        for (int i = start; i < enter.length(); i++) {
            esEnter = esEnter && Character.isDigit(enter.charAt(i));
        }


        if (esEnter) {
            System.out.println("\" " + enter + "\" és enter");
        } else {
            System.out.println("\" " + enter + "\" no és enter");
        }

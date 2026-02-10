 //desenvolupa una nova versió del programa EsEnter que es comporti similar a l'exercici anterior. Aquest cop, però, esperarà per línia de comandes (args[0]) la modalitat (els valors "estricte" o "flexible") i actuarà en conseqüència
public class EsEnter {

    public static void main(String[] args) {

        boolean estricte;

        if (args[0].equals("estricte")) {
            estricte = true;
        } else if (args[0].equals("flexible")) {
            estricte = false;
        } else {
            System.err.println("Modalitat incorrecta");
            return;
        }

        System.out.println("Introdueix els texts a analitzar:");

        String text = Entrada.readLine();

        if (text.equals("")) {
            System.out.println("Adéu");
            return;
        }

        while (!text.equals("Adéu") && !text.equals("")) {

            if (UtilString.esEnter(text, estricte)) {
                System.out.println("\"" + text + "\" és enter");
            } else {
                System.out.println("\"" + text + "\" no és enter");
            }

            text = Entrada.readLine();
        }

        System.out.println("Adéu");
    }
}


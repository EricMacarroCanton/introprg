 //desenvolupa una nova versió del programa EsEnter que es comporti similar a l'exercici anterior. Aquest cop, però, esperarà per línia de comandes (args[0]) la modalitat (els valors "estricte" o "flexible") i actuarà en conseqüència
// EsEnter.java
public class EsEnter {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Modalitat no reconeguda");
            return;
        }

        boolean estricte;

        if (args[0].equals("estricte")) {
            estricte = true;
        } else if (args[0].equals("flexible")) {
            estricte = false;
        } else {
            System.out.println("Modalitat no reconeguda");
            return;
        }

        System.out.println("Introdueix els texts a analitzar:");

        String text = Entrada.readLine();

        while (!text.equals("") && !text.equals("Adéu")) {

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

        

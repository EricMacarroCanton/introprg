/* Desenvolupa un programa que mostri tres enters separats per comes tenint en comptes que els tres valors es troben emmagatzemats en un array d'enters.

Exercici on hauràs de reemplaçar els valors que apareixen pel contingut corresponent:*/
public class EntersEntreComes {

    public static void main(String[] args) {

      int quants = demanarEnter("Quants?");

if (quants < 0) {
    quants = 0;
}

int[] numeros = new int[quants];


        char separador = demanarSeparador();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = demanarEnter("Valor " + (i + 1) + "?");
        }

        System.out.println(UtilString.entreComes(numeros, separador));
    }

 
    public static int demanarEnter(String missatge) {
        String text;

        System.out.println(missatge);
        text = Entrada.readLine();

        while (!UtilString.esEnter(text)) {
            System.out.println("Per favor, un valor enter");
            text = Entrada.readLine();
        }

        return Integer.parseInt(text);
    }

    // Demana el separador
    public static char demanarSeparador() {
        System.out.println("Separador?");
        String text = Entrada.readLine();

        if (text.length() == 0) {
            return ',';
        } else {
            return text.charAt(0);
        }
    }
}


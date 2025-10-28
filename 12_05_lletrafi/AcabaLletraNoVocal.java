public class AcabaLletraNoVocal {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        if (text.length() == 0) {
            System.out.println("\"" + text + "\" no finalitza amb lletra no vocal");
            return;
        }

        // Busquem l'últim caràcter que sigui una lletra
        int i = text.length() - 1;
        while (i >= 0 && !Character.isLetter(text.charAt(i))) {
            i--;
        }

        if (i < 0) {
            // No hi ha cap lletra
            System.out.println("\"" + text + "\" no finalitza amb lletra no vocal");
        } else {
            char ultimaOriginal = text.charAt(i); // mantenim la lletra original
            char ultima = Character.toLowerCase(ultimaOriginal); // per la comprovació de vocal

            if (ultima != 'a' && ultima != 'e' && ultima != 'i' && ultima != 'o' && ultima != 'u') {
                System.out.println("\"" + text + "\" finalitza amb lletra no vocal '" + ultimaOriginal + "'");
            } else {
                System.out.println("\"" + text + "\" no finalitza amb lletra no vocal");
            }
        }
    }
}


public class AcabaLletraNoVocal {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        if (text.length() == 0) {
            System.out.println("\"" + text + "\" no finalitza amb lletra no vocal");
            return;
        }

        char ultimaOriginal = text.charAt(text.length() - 1);

        if (!Character.isLetter(ultimaOriginal)) {
            // L'últim caràcter no és una lletra
            System.out.println("\"" + text + "\" no finalitza amb lletra no vocal");
        } else {
            // Comprovem si és vocal
            char ultima = Character.toLowerCase(ultimaOriginal);
            if (ultima == 'a' || ultima == 'e' || ultima == 'i' || ultima == 'o' || ultima == 'u') {
                System.out.println("\"" + text + "\" no finalitza amb lletra no vocal");
            } else {
                System.out.println("\"" + text + "\" finalitza amb la lletra no vocal '" + ultimaOriginal + "'");
            }
        }
    }
}


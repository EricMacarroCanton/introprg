// exercici 12_04 on hem de fer un codi per veure si la paraula començaamb vocal o no (eric)

public class IniciaVocal {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        char primera = ' '; // inicialitzem amb un valor per defecte

        // Només agafem el primer caràcter de text
        if (text.length() > 0) {
            primera = Character.toLowerCase(text.charAt(0));
        }

        // Comprovació vocal
        if (text.length() == 0) {
            System.out.println("El text no té lletres");
        } else if (primera == 'a' || primera == 'e' || primera == 'i' || primera == 'o' || primera == 'u') {
            System.out.println("\"" + text + "\" inicia amb la vocal '" + primera + "'");
        } else {
            System.out.println("\"" + text + "\" no inicia amb vocal");
        }
    }
}


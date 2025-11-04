// exercici 12_04 on hem de fer un codi per veure si la paraula començaamb vocal o no (eric)
public class IniciaVocal {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        if (text.length() == 0 || !Character.isLetter(text.charAt(0))) {
            System.out.println("El text no té lletres");
        } else {
            char primeraOriginal = text.charAt(0); 
            char primera = Character.toLowerCase(primeraOriginal); 

            if (primera == 'a' || primera == 'e' || primera == 'i' || primera == 'o' || primera == 'u') {
                System.out.println("\"" + text + "\" inicia amb la vocal '" + primeraOriginal + "'");
            } else {
                System.out.println("\"" + text + "\" no inicia amb vocal");
            }
        }
    }
}


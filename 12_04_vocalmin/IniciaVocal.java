public class IniciaVocal {
    public static void main(String[] args) {
        System.out.println("Text?");
        String paraula = Entrada.readLine();

        if (paraula.length() == 0) {
            System.out.println("El text no té lletres");
            return;
        }

        char primera = paraula.charAt(0);
        primera = Character.toLowerCase(primera);

        if (primera == 'a' || primera == 'e' || primera == 'i' || primera == 'o' || primera == 'u') {
            System.out.println("\"" + paraula + "\" inicia amb la vocal '" + primera + "'");
        } else {
            System.out.println("\"" + paraula + "\" no inicia amb vocal");
        }
    }
}


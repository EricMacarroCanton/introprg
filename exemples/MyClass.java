public class MyClass {

    public static boolean hiHaVocals(String text) {
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return true; // si trobem una vocal, retornem true immediatament
            }
        }
        return false; // si no trobem cap vocal, retornem false
    }

    public static void main(String[] args) {
            System.out.println("Introdueix frase");
        String text = Entrada.readLine();
         boolean comptador = hiHaVocals(text);
        System.out.println("Hi ha vocals: " + comptador);
    }
}


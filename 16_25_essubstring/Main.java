//És una funció molt còmoda però té algunes limitacions ja hem adreçat a exercicis anteriors.
//De la mateixa manera que ja hem fet, per exemple, amb String.endsWith(), crearem una adaptació de contains() amb les següents signatures:
// Main.java
public class Main {
    public static void main(String[] args) {
        // Mode estricte o laxe sense usar equalsIgnoreCase
        boolean estricte;
        if (args[0].toLowerCase().equals("laxe")) {
            estricte = false;
        } else {
            estricte = true;
        }

        System.out.println("Text principal?");
        String text = Entrada.readLine();

        System.out.println("substring?");
        String substring = Entrada.readLine();

        System.out.printf(
            "esSubstring(substring: \"%s\", text: \"%s\", estricte: %b) -> %b%n",
            substring, text, estricte,
            UtilString.esSubstring(substring, text, estricte)
        );
    }
}

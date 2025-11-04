/*
 * Programa: InformeString
 * Descripció: Aquest programa demana a l'usuari un text i una posició (índex).
 * A continuació, mostra informació sobre el text utilitzant diversos
 * mètodes de la classe String, com ara length(), charAt(), toUpperCase(), etc.
 *
 * Autor: [Eric Macarro]
 *
 */
public class InformeCaracter {
    public static void main(String[] args) {
        // Lectura de dades
        System.out.println("Text?");
        String text = Entrada.readLine();

        System.out.println("Posició?");
        int posicio = Integer.parseInt(Entrada.readLine());
        
        char c = text.charAt(posicio);
    
        System.out.println("Character.getName('" + c + "'): " + Character.getName(c));
        System.out.println("Character.isDigit('" + c + "'): " + Character.isDigit(c));
        System.out.println("Character.isJavaIdentifierStart('" + c + "'): " + Character.isJavaIdentifierStart(c));
        System.out.println("Character.isJavaIdentifierPart('" + c + "'): " + Character.isJavaIdentifierPart(c));
        System.out.println("Character.isLetter('" + c + "'): " + Character.isLetter(c));
        System.out.println("Character.isLowerCase('" + c + "'): " + Character.isLowerCase(c));
        System.out.println("Character.isUpperCase('" + c + "'): " + Character.isUpperCase(c));
        System.out.println("Character.isWhitespace('" + c + "'): " + Character.isWhitespace(c));
        System.out.println("Character.toLowerCase('" + c + "'): " + Character.toLowerCase(c));
        System.out.println("Character.toUpperCase('" + c + "'): " + Character.toUpperCase(c));
    }
}


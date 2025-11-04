/*
 * Programa: InformeString
 * Descripció: Aquest programa demana a l'usuari tres dades:
 *   - Un text principal
 *   - Un text secundari
 *   - Un número positiu
 * A continuació mostra per pantalla diverses operacions aplicades
 * sobre el text principal i el text secundari fent servir mètodes
 * de la classe String, com ara:
 *   - length(), startsWith(), endsWith(), equals(), equalsIgnoreCase(),
 *     isBlank(), isEmpty(), charAt(), concat(), repeat(),
 *     toUpperCase() i toLowerCase().
 *
 * Autor: [Eric Macarro]
 */
 public class InformeString {
    public static void main(String[] args) {
        // Lectura de dades
        System.out.println("Text principal?");
        String principal = Entrada.readLine();

        System.out.println("Text secundari?");
        String secundari = Entrada.readLine();

        System.out.println("Número positiu?");
        int num = Integer.parseInt(Entrada.readLine());

      System.out.println("\"" + principal + "\".length(): " + principal.length());
System.out.println("\"" + principal + "\".startsWith(\"" + secundari + "\"): " + principal.startsWith(secundari));
System.out.println("\"" + principal + "\".endsWith(\"" + secundari + "\"): " + principal.endsWith(secundari));
System.out.println("\"" + principal + "\".equals(\"" + secundari + "\"): " + principal.equals(secundari));
System.out.println("\"" + principal + "\".equalsIgnoreCase(\"" + secundari + "\"): " + principal.equalsIgnoreCase(secundari));
System.out.println("\"" + principal + "\".isBlank(): " + principal.isBlank());
System.out.println("\"" + principal + "\".isEmpty(): " + principal.isEmpty());
System.out.println("\"" + principal + "\".charAt(" + num + "): " + principal.charAt(num));
System.out.println("\"" + principal + "\".concat(\"" + secundari + "\"): " + principal.concat(secundari));
System.out.println("\"" + principal + "\".repeat(" + num + "): " + principal.repeat(num));
System.out.println("\"" + principal + "\".toUpperCase(): " + principal.toUpperCase());
System.out.println("\"" + principal + "\".toLowerCase(): " + principal.toLowerCase());
}
}

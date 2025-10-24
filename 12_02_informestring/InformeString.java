public class InformeString {
    public static void main(String[] args) {
        // Lectura de dades
        System.out.println("Text principal?");
        String text = Entrada.readLine();

        System.out.println("Text secundari?");
        String textSecundari = Entrada.readLine();

        System.out.println("Número positiu?");
        int numeroPositiu = Integer.parseInt(Entrada.readLine());

        // Preparar els resultats
        int longitud = text.length();
        boolean iniciaAmb = text.startsWith(textSecundari);
        boolean acabaAmb = text.endsWith(textSecundari);
        boolean iguala = text.equals(textSecundari);
        boolean igualaSenseCase = text.equalsIgnoreCase(textSecundari);
        boolean estaEnBlanc = text.isBlank();
        boolean estaBuit = text.isEmpty();
        char caracter3 = text.charAt(numeroPositiu);
        String concatenat = text.concat(textSecundari);
        String repetit = text.repeat(numeroPositiu);
        String majuscules = text.toUpperCase();
        String minuscules = text.toLowerCase();

        // Mostrar els resultats
        System.out.println("\"" + text + "\".length(): " + longitud);
        System.out.println("\"" + text + "\".startsWith(\"" + textSecundari + "\"): " + iniciaAmb);
        System.out.println("\"" + text + "\".endsWith(\"" + textSecundari + "\"): " + acabaAmb);
        System.out.println("\"" + text + "\".equals(\"" + textSecundari + "\"): " + iguala);
        System.out.println("\"" + text + "\".equalsIgnoreCase(\"" + textSecundari + "\"): " + igualaSenseCase);
        System.out.println("\"" + text + "\".isBlank(): " + estaEnBlanc);
        System.out.println("\"" + text + "\".isEmpty(): " + estaBuit);
        System.out.println("\"" + text + "\".charAt(numeroPositiu): " + caracter3);
        System.out.println("\"" + text + "\".concat(\"" + textSecundari + "\"): " + concatenat);
        System.out.println("\"" + text + "\".repeat(" + numeroPositiu + "): " + repetit);
        System.out.println("\"" + text + "\".toUpperCase(): " + majuscules);
        System.out.println("\"" + text + "\".toLowerCase(): " + minuscules);
    }
}


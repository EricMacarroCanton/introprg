/*
 * Programa: AcabaLletraNoVocal
 * Descripció: Aquest programa demana un text a l'usuari i comprova si
 * finalitza amb una lletra que no sigui una vocal. 
 * - Si el text és buit o només conté espais, mostra el missatge
 *   "El text no té lletres".
 * - Si el text acaba amb una vocal o un caràcter que no és lletra,
 *   mostra que no finalitza amb lletra no vocal.
 * - Si acaba amb una consonant, indica quina és la lletra final.
 *
 * Autor: Eric Macarro
 */
public class AcabaLletraNoVocal {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        // Si el text és buit o només té espais
        if (text.isBlank()) {
            System.out.println("El text no té lletres");
        } else {
            char ultimaOriginal = text.charAt(text.length() - 1);

            if (!Character.isLetter(ultimaOriginal)) {
                System.out.println("\"" + text + "\" no finalitza amb lletra no vocal");
            } else {
                char ultima = Character.toLowerCase(ultimaOriginal);
                if (ultima == 'a' || ultima == 'e' || ultima == 'i' || ultima == 'o' || ultima == 'u') {
                    System.out.println("\"" + text + "\" no finalitza amb lletra no vocal");
                } else {
                    System.out.println("\"" + text + "\" finalitza amb la lletra no vocal '" + ultimaOriginal + "'");
                }
            }
        }
    }
}



/*
 * Programa: AnalitzaCaracter
 * Descripció: Aquest programa demana un text i una posició.
 * - Si el text és buit, mostra "Text buit" i finalitza.
 * - Si la posició és dins del rang, s'agafa el caràcter corresponent.
 * - Si la posició és superior a la longitud, continua comptant des de l'inici.
 * - Si la posició és negativa, comença a comptar des del final.
 * Finalment indica quin caràcter és i la seva categoria:
 *   - lletra majúscula
 *   - lletra minúscula
 *   - dígit
 *   - altre
 *
 * Autor: Eric Macarro
 */

public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String cadena = Entrada.readLine();

        // Comprovació si el text és buit
        if (cadena.isBlank()) {
            System.out.println("Text buit");
        } else {
            System.out.println("Posició?");
            int index = Integer.parseInt(Entrada.readLine());

            int llargada = cadena.length();

            // Ajustem la posició segons el valor introduït
            if (index >= 0) {
                index = index % llargada;  // si supera la longitud, torna a l'inici
            } else {
                index = llargada + (index % llargada);  // si és negativa, compta des del final
                if (index < 0) index += llargada; // corregeix en cas de % negatiu
            }

            char simbol = cadena.charAt(index);

            // Classificació del caràcter
            if (Character.isUpperCase(simbol)) {
                System.out.println("'" + simbol + "' és una lletra majúscula");
            } else if (Character.isLowerCase(simbol)) {
                System.out.println("'" + simbol + "' és una lletra minúscula");
            } else if (Character.isDigit(simbol)) {
                System.out.println("'" + simbol + "' és un dígit");
            } else {
                System.out.println("'" + simbol + "' és una altra cosa");
            }
        }
    }
}


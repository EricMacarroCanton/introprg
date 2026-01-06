/*
 * Programa: CadenaContinua modular
 *
 * Demana un text i un nombre enter, i mostra tants caràcters del text com
 * indiqui el nombre, començant pel primer. Si es necessiten més caràcters
 * dels que té el text, es repeteix des del principi.
 * No mostra res si la longitud és menor que 1. Si el text és buit o només
 * conté espais, mostra un missatge d'error.
 */
public class CadenaContinua {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        if (text.trim().isEmpty()) { // text buit o només espais
            System.out.println("Text buit o només espais");
            return;
        }

        System.out.println("Nombre?");
        int longitud = Integer.parseInt(Entrada.readLine());

        if (longitud < 1) {
            return; // no mostrar res
        }

        mostraCadenaContinua(text, longitud);
    }

    // Mostra els caràcters de manera contínua i repetida fins aconseguir 'longitud'
    public static void mostraCadenaContinua(String text, int longitud) {
        int llargada = text.length();
        for (int i = 0; i < longitud; i++) {
            System.out.print(text.charAt(i % llargada));
        }
        System.out.println();
    }
}


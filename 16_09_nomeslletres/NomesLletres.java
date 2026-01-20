/*
 * Programa: NomesLletres
 *
 * Demana un text i mostra només les lletres
 * separades per comes, en l'ordre original.
 */
public class NomesLletres {

    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        String nomesLletres = UtilString.nomesLletres(text);
        String separades = UtilString.lletresSeparades(nomesLletres);

        System.out.println(separades);
    }
}


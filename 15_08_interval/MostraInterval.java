/*
 * Programa: MostraInterval modular
 *
 * Demana un text i dos valors enters (inici i fi) i mostra els caràcters
 * entre aquests índexs. Si els límits estan fora del rang, es normalitzen.
 * Si inici > fi, mostra els caràcters en ordre invers.
 */
public class MostraInterval {

    public static void main(String[] args) {
        System.out.println("text?");
        String text = Entrada.readLine();

        System.out.println("inici?");
        int inici = Integer.parseInt(Entrada.readLine());

        System.out.println("final?");
        int fi = Integer.parseInt(Entrada.readLine());

        mostraInterval(text, inici, fi);
    }

    // Mostra els caràcters del text entre els índexs inici i fi
    public static void mostraInterval(String text, int inici, int fi) {
        int llargada = text.length();

        // Normalitzar els índexs dins del rang [0, llargada-1]
        if (llargada == 0) {
            return; // text buit, no mostrar res
        }

        // Ajustar límits
        if (inici < 0) inici = 0;
        if (fi < 0) fi = 0;
        if (inici >= llargada) inici = llargada - 1;
        if (fi >= llargada) fi = llargada - 1;

        // Mostrar els caràcters en ordre correcte
        if (inici <= fi) {
            for (int i = inici; i <= fi; i++) {
                System.out.println(text.charAt(i));
            }
        } else {
            for (int i = inici; i >= fi; i--) {
                System.out.println(text.charAt(i));
            }
        }
    }
}


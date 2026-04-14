//A banda, ofereix dos constructors, el de per defecte que l'inicialitzarà tancat, i un d'específic que permet indicar si l'ull comença obert (true) o no.
public class UsaGatRenat {

    public static void main(String[] args) {
        GatRenat renat = GatRenat.getInstancia();
        System.out.println("Inicialment Renat està " + renat.getPosicio());

        for (String posicio : args) {
            canviaPosicio(posicio);
            System.out.println("Ara està " + renat.getPosicio());
        }
    }

    private static void canviaPosicio(String novaPosicio) {
        if (novaPosicio.equals("1")) novaPosicio = "estirat";
        else if (novaPosicio.equals("2")) novaPosicio = "assegut";
        else if (novaPosicio.equals("3")) novaPosicio = "dret";

        if (novaPosicio.equals("estirat") || novaPosicio.equals("assegut") || novaPosicio.equals("dret")) {
            GatRenat.getInstancia(novaPosicio);
        }
    }
}

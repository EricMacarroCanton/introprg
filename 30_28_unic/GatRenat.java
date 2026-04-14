//En aquest exercici implementaràs una versió de la classe GatRenat de manera que només hi pugui haver una única instància.

//Recupera alguna versió antiga de GatRenat, per exemple mots constructors i segueix les passes que t'enumero a continuació:

public class GatRenat {
    private static GatRenat instancia;

    private int vides;
    private String posicio;

    // Constructor privat
    private GatRenat() {
        this.vides = 7;
        this.posicio = "estirat";
    }

    // Singleton bàsic
    public static GatRenat getInstancia() {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        return instancia;
    }

    // Amb vides
    public static GatRenat getInstancia(int vides) {
        GatRenat r = getInstancia();
        r.vides = vides;
        return r;
    }

    // Amb posició
    public static GatRenat getInstancia(String posicio) {
        GatRenat r = getInstancia();
        r.posicio = posicio;
        return r;
    }

    // Amb vides i posició
    public static GatRenat getInstancia(int vides, String posicio) {
        GatRenat r = getInstancia();
        r.vides = vides;
        r.posicio = posicio;
        return r;
    }

    public int getVides() {
        return vides;
    }

    public String getPosicio() {
        return posicio;
    }
}

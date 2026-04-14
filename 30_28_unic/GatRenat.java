//En aquest exercici implementaràs una versió de la classe GatRenat de manera que només hi pugui haver una única instància.

//Recupera alguna versió antiga de GatRenat, per exemple mots constructors i segueix les passes que t'enumero a continuació:
public class GatRenat {

    private static GatRenat instancia = null;

    private String nom;
    private String posicio;
    private int vides;

    private GatRenat() {
        this.nom = "Renat";
        this.posicio = "estirat";
        this.vides = 7;
    }

    private GatRenat(String nom, String posicio) {
        this.nom = nom;
        this.posicio = posicio;
        this.vides = 7;
    }

    private GatRenat(int vides, String posicio) {
        this.nom = "Renat";
        this.posicio = posicio;
        this.vides = vides;
    }

    public static GatRenat getInstancia() {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        return instancia;
    }

    public static GatRenat getInstancia(String posicio) {
        if (instancia == null) {
            instancia = new GatRenat("Renat", posicio);
        } else {
            instancia.posicio = posicio;
        }
        return instancia;
    }

    public static GatRenat getInstancia(int vides) {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        instancia.vides = vides;
        return instancia;
    }

    public static GatRenat getInstancia(int vides, String posicio) {
        if (instancia == null) {
            instancia = new GatRenat(vides, posicio);
        } else {
            instancia.vides   = vides;
            instancia.posicio = posicio;
        }
        return instancia;
    }

    public String getNom()     { 
    return nom; }
    public String getPosicio() { 
    return posicio; }
    public int    getVides()   { 
    return vides; }

}

//Els ulls estaran oberts o tancats depenent de la posició del gat. Si el gat està dret, tots dos ulls estaran oberts. Si està assegut, l'ull dret estarà obert i l'esquerre estarà tancat. Quan està estirat, tots dos ulls estaran tancats.
public class GatRenat {

    private String nom;
    private String posicio;

    public GatRenat() {
        this.nom     = "Renat";
        this.posicio = "estirat";
    }

    public String getNom()     { return nom; }
    public String getPosicio() { return posicio; }
}

//Els ulls estaran oberts o tancats depenent de la posició del gat. Si el gat està dret, tots dos ulls estaran oberts. Si està assegut, l'ull dret estarà obert i l'esquerre estarà tancat. Quan està estirat, tots dos ulls estaran tancats.
public class GatRenat {

    private String nom;
    private String posicio;
    private UllDeGat ullDret;
    private UllDeGat ullEsquerre;

    public GatRenat() {
       
    }


public GatRenat(String nom) {
    
}


    public GatRenat(String nom, String posicio) {

     
    }

    private void actualitzaUlls() {
        
    }

    public void seu() {
        
    }

    public void aixecat() {
      
    }

    public void estirat() {
        
    }
    
    public UllDeGat getUllDret() {
        return new UllDeGat(ullDret.esObert());
    }

    public UllDeGat getUllEsquerre() {
        return new UllDeGat(ullEsquerre.esObert());
    }

    public String getNom()     { return nom; }
    public String getPosicio() { return posicio; }

    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
        renat.seu();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
        renat.aixecat();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
    }
}

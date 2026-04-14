////A banda, ofereix dos constructors, el de per defecte que l'inicialitzarà tancat, i un d'específic que permet indicar si l'ull comença obert (true) o no.

//Amplia la classe GatRenat de manera que ara tingui dos ulls.
public class UllDeGat {

    private boolean obert;

    public UllDeGat() {
        this.obert = false;
    }

    public UllDeGat(boolean obert) {
        this.obert = obert;
    }

    public void obret()          { obert = true; }
    public void tanca()          { obert = false; }
    public boolean esObert()     { return obert; }
}

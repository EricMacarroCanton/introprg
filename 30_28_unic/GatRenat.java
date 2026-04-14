//En aquest exercici implementaràs una versió de la classe GatRenat de manera que només hi pugui haver una única instància.

//Recupera alguna versió antiga de GatRenat, per exemple mots constructors i segueix les passes que t'enumero a continuació:

public class GatRenat {
    private static GatRenat instancia;
    private String posicio;

   
    private GatRenat() {
        posicio = "estirat";
    }


    public static GatRenat getInstancia() {
        if (instancia == null) {
            instancia = new GatRenat();
        }
        return instancia;
    }

    public String getPosicio() {
        return posicio;
    }

    public void setPosicio(String posicio) {
        this.posicio = posicio;
    }
}

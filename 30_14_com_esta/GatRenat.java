/*En aquesta ocasió protegirem les propietats de l'ascensor de manera que:

el pis sempre sigui un valor entre -1 i 10

el moviment sempre sigui un dels següents valors: aturat, pujant, baixant

Inicialment, l'ascensor començarà a la planta -1 i aturat.*/
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";

    public int getVides() {
        return vides;
    }

    public void setVides(int novesVides) {
        if (novesVides >= 0) {
            vides = novesVides;
        }
    }

    public String getPosicio() {
        return posicio;
    }

    public void setPosicio(String novaPosicio) {
        if (novaPosicio.equals("estirat") ||
            novaPosicio.equals("assegut") ||
            novaPosicio.equals("dret")) {
            posicio = novaPosicio;
        }
    }

    // Mètodes booleans
    public boolean esViu() {
        return vides > 0;
    }

    public boolean esDret() {
        return posicio.equals("dret");
    }

    public boolean esAssegut() {
        return posicio.equals("assegut");
    }

    public boolean esEstirat() {
        return posicio.equals("estirat");
    }
}

public class GatRenat {
    private int vides = -1;
    private String posicio = "aturat";

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
}

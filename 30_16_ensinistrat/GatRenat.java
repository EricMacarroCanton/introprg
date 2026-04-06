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


    public String aixecat() {
        if (esDret()) {
            return "passo de fer res";
        } else {
            posicio = "dret";
            return "ja m'aixeco";
        }
    }
//afegim 3 nous moduls
    public String seu() {
        if (esAssegut()) {
            return "passo de fer res";
        } else {
            posicio = "assegut";
            return "ja m'assec";
        }
    }

    public String estirat() {
        if (esEstirat()) {
            return "passo de fer res";
        } else {
            posicio = "estirat";
            return "ja m'estiro";
        }
    }
}

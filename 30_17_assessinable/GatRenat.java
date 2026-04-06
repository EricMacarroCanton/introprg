//Si et passa com a mi, a hores d'ara t'hauràs encarinyant amb el gat Renat. Però no a tothom li passa. De fet, hi ha qui podria voler que nostre estimat amic l'espitxi. Per exemple, imagina't que algú el fa servir com a personatge d'un joc en el que pugui anar perdent vides
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

    // Mètodes de posició
    public String aixecat() {
        if (esDret()) {
            return "...";
        } else {
            posicio = "dret";
            return "ja m'aixeco";
        }
    }

    public String seu() {
        if (esAssegut()) {
            return "...";
        } else {
            posicio = "assegut";
            return "ja m'assec";
        }
    }

    public String estirat() {
        if (esEstirat()) {
            return "...";
        } else {
            posicio = "estirat";
            return "ja m'estiro";
        }
    }

    // Nous mètodes vides
    public String mor() {
        if (!esViu()) {
            return "...";
        }

        vides--;

        if (vides > 0) {
            return "auch";
        } else {
            return "ximpún";
        }
    }

    public String reviu() {
        if (!esViu()) {
            vides = 1;
            return "guai!";
        } else {
            return "...";
        }
    }

    public String reviu(int novesVides) {
        if (novesVides < 1) {
            return "...";
        }

        if (!esViu()) {
            vides = novesVides;
            return "guai!";
        } else {
            return "...";
        }
    }
}

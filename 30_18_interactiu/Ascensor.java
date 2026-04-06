//Aquest exercici torna a revisar l'ascensor que hem fet en exercicis anteriors. En aquesta ocasió ampliaràs els mètodes que ofereix l'ascensor de manera que aquest sigui més usable.

//Afegeix al repertori de mètodes de Ascensor els següents
public class Ascensor {

    private int pis = -1;
    private String moviment = "aturat";

    public boolean esAbaix() {
        return (pis == -1);
    }

    public boolean esAdalt() {
        return (pis == 10);
    }

    public boolean esAturat() {
        return moviment.equals("aturat");
    }

    public boolean esEnMoviment() {
        return (moviment.equals("pujant") || moviment.equals("baixant"));
    }

    public boolean esPujant() {
        return moviment.equals("pujant");
    }

    public boolean esBaixant() {
        return moviment.equals("baixant");
    }

    public String comEsta() {
        if (esPujant()) {
            return "pujant al pis " + pis;
        } else if (esBaixant()) {
            return "baixant al pis " + pis;
        } else {
            return "aturat al pis " + pis;
        }
    }

    public int getPis() {
        return pis;
    }

    public String getMoviment() {
        return moviment;
    }

    public void setPis(int pis) {
        if (pis >= -1 && pis <= 10) {
            this.pis = pis;
        }
    }

    public void setMoviment(String moviment) {
        if (moviment.equals("aturat") ||
            moviment.equals("pujant") ||
            moviment.equals("baixant")) {

            this.moviment = moviment;
        }
    }

    //  NOUS MÈTODES

    public boolean aturat() {
        if (!esAturat()) {
            moviment = "aturat";
            return true;
        }
        return false;
    }

    public boolean arrencaAmunt() {
        if (esAturat()) {
            moviment = "pujant";
            return true;
        }
        return false;
    }



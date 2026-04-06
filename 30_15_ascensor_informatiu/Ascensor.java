/* esAbaix() i esAdalt() retornen cert quan l'ascensor es troba al primer i al darrer pis respectivament.

esEnMoviment() retorna cert quan està pujant o baixant.

comEsta() retorna un String amb el moviment i el pis. Per exemple, si està pujant en el pis 1, el missatge serà pujant al pis 1.*/
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
}

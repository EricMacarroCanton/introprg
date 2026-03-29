/* esAbaix() i esAdalt() retornen cert quan l'ascensor es troba al primer i al darrer pis respectivament.

esEnMoviment() retorna cert quan està pujant o baixant.

comEsta() retorna un String amb el moviment i el pis. Per exemple, si està pujant en el pis 1, el missatge serà pujant al pis 1.*/
public class Ascensor {
    private int pis;
    private String moviment;

    public Ascensor() {
        pis = -1;
        moviment = "aturat";
    }


    public int getPis() {
        return pis;
    }

    public void setPis(int pis) {
        this.pis = pis;
    }

    public String getMoviment() {
        return moviment;
    }

    public void setMoviment(String moviment) {
        this.moviment = moviment;
    }



     public boolean esAbaix() {
        return pis == 0;
    }

    public boolean esAdalt() {
        return pis == 12;
    }

     public boolean esAturat() {
        return moviment.equals("aturat");
    }

    public boolean esEnMoviment() {
        return esPujant() || esBaixant();
    }

    public boolean esPujant() {
	return true ;
    }

    public boolean esBaixant() {
	return true ;
    }

    public String comEsta() {
        return moviment + " al pis " + pis;
    }
}
    


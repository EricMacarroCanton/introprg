//Potser ens podem plantejar la seva utilitat com a classe, però recordem que els nostres tan utilitzats Strings tampoc no ofereixen mecanismes per a modificar-los un cop creats. És a dir, ara mateix el nostre Gat Renat és immutable!
 public class GatRenat {

    private int vides;
    private String posicio;

    public GatRenat() {
        vides = 7;
        posicio = "estirat";
    }

    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }

    public int getVides() {
        return vides;
    }

    public String getPosicio() {
        return posicio;
    }

    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println(renat);
    }
}

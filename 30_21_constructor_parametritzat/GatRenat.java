/*Fixa't que, com que no en fem res de la instància, a banda de mostrar-la, no cal ni que la assignem a una variable!

El resultat de l'execució serà:

Vides: 7. Posició: estirat */

public class GatRenat {
    private int vides;
    public GatRenat(int novesVides) {
        vides = novesVides;
    }
    public int getVides() { return vides; }
    @Override
    public String toString() {
        return String.format("Vides: %d", vides);
    }
    public static void main(String[] args) {
        GatRenat renat = new GatRenat(7);
        System.out.println(renat);
    }
}

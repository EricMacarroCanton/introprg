//Afegeix tres nous mètodes: String aixecat(), String seu(), i String estirat() de manera que quan vulguem, per exemple, que en Renat s'aixequi simplement li diguem renat.aixecat();.
public class UsaGatRenat {
    public static void main(String[] args) {

        GatRenat renat = new GatRenat();

        System.out.println("El Renat diu: " + renat.aixecat());
        System.out.println("El Renat diu: " + renat.seu());
        System.out.println("El Renat diu: " + renat.estirat());
        System.out.println("El Renat diu: " + renat.estirat());
    }
}

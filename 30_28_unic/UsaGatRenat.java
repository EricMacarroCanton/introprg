//En aquest exercici implementaràs una versió de la classe GatRenat de manera que només hi pugui haver una única instància.
 public class UsaGatRenat {
     public static void main(String[] args) {
         GatRenat renat = GatRenat.getInstancia();
         System.out.println("Inicialment Renat està " + renat.getPosicio());
         for (String posicio: args) {
             canviaPosicio(posicio);
             System.out.println("Ara està " + renat.getPosicio());
         }
     }
     private static void canviaPosicio(String novaPosicio) {
    GatRenat renat = GatRenat.getInstancia();

    if (novaPosicio.equals("1")) {
        renat.setPosicio("estirat");
    } else if (novaPosicio.equals("2")) {
        renat.setPosicio("assegut");
    } else if (novaPosicio.equals("3")) {
        renat.setPosicio("dret");
    		}
	}
}

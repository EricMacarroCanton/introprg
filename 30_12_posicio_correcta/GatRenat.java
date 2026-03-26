//En aquest exercici, torna a afegir la propietat posicio que vas incorporar a l'exercici Renat té posició. En aquesta ocasió, fes la propietat privada i implementa els accessors de manera que garanteixis que la posició del Renat sigui sempre correcta, a l'hora que pugui ser canviada.
public class GatRenat {
       private int vides = 7;
	private String posicio = "estirat";
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();
           renat.vides = -12;
           System.out.println("El gat Renat té " + renat.vides + " vides");
       }
   }

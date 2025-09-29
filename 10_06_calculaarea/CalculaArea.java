/*
Anem a calcular l'àrea d'un cercle
*/
public class CalculaArea {
    public static void main(String[] args) {
        System.out.println("Càlcul de l'àrea d'un cercle");
         System.out.println("Introdueix el radi:");
        String linia =  Entrada.readLine() ;
        System.out.println("Introdueix les unitats (cm,m...)");
        String unitats = Entrada.readLine();
        float radi = Float.parseFloat(linia);
        float area =  (float)Math.PI * radi * radi;
        System.out.println("l'àrea és " + area + unitats+ " ^2");
    }
}

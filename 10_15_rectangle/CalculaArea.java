/*
Anem a calcular l'àrea d'un rectangle
*/
public class CalculaArea {
    public static void main(String[] args) {
        System.out.println("Càlcul de l'àrea d'un rectangle");
         System.out.println("Introduïu la base:");
        String base =  Entrada.readLine() ;
        System.out.println("Introduïu l'altura:");
        String altura = Entrada.readLine();
         System.out.println("Introduïu les unitats (ex. cm):");
         String unitats = Entrada.readLine();
        float numBase = Float.parseFloat(base);
        float numAltura = Float.parseFloat(altura);
        int area =  (int)(numBase * numAltura); 
        System.out.println("L'àrea d'un rectangle de base " + base + unitats + " i altura " + altura + unitats + " és " + area + unitats + "^2");
    }
}

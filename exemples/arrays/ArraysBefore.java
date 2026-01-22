public class ArraysBefore {
    public static void main(String[] args) {
    
   
    System.out.println("Entri un numero:");
    
    int numero = Integer.parseInt(Entrada.readLine());
    int total = 0;
    
        while (numero != -1) {
            total += numero;
            numero = Integer.parseInt(Entrada.readLine());
        }
        
        System.out.println("Total de la lista: " + total);
    } 
}

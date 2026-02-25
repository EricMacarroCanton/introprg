public class Fruites {
    public static void main(String[] args) {
        

        String[] fruites = {"Pomes", "Préssecs", "Platans"};
        int[][] vendes = {
            {4, 6, 2},
            {7, 48, 3},
            {7, 40, 10} 
        }; 
        
     
        

        mostraVendesTotals(fruites, vendes);
    }
    
      public static void mostraVendes(String[] fruites, int[][] vendes) {
        for (int i = 0; i < fruites.length; i++) {
            System.out.printf("%10s", fruites[i]);
        }
        System.out.println();
        
        for (int dia = 0; dia < vendes.length; dia++) {
            for (int quantitat = 0; quantitat < vendes[dia].length; quantitat++) {
                System.out.printf("%10d", vendes[dia][quantitat]);
            }
            System.out.println();
        }
    }
    public static void mostraVendesTotals(String[] fruites, int[][] vendes) {
        
        for (int i = 0; i < fruites.length; i++) {
            System.out.printf("%10s", fruites[i]);
        }
        System.out.printf("%10s", "Total");
        System.out.println();
        

        for (int dia = 0; dia < vendes.length; dia++) {
            int sumaDia = 0;
            for (int quantitat = 0; quantitat < vendes[dia].length; quantitat++) {
                System.out.printf("%10d", vendes[dia][quantitat]);
                sumaDia += vendes[dia][quantitat];
            }
            System.out.printf("%10d", sumaDia); 
            System.out.println();
        }
    }
}

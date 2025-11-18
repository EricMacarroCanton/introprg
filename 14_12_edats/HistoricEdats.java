public class HistoricEdats {
    public static void main(String[] args) {
        System.out.println("nom?");
        String nom = Entrada.readLine();

        System.out.println("edat?");
        int edat = Integer.parseInt(Entrada.readLine());

        System.out.println("any actual?");
        int anyActual = Integer.parseInt(Entrada.readLine());

      
        if (nom.isEmpty() || edat < 0 || anyActual < 1971) {
            System.out.println("Entrada incorrecta");
           
        }

    
        if (edat == 0) {
            System.out.println("Adéu " + nom);
            
        }

        int anyNaixement = anyActual - edat;

       
        System.out.println("El " + anyNaixement + " vau néixer");

    
        for (int i = 1; i < edat; i++) {
            int any = anyNaixement + i;
            int anyEdat = i;
            System.out.println("El " + any + " teníeu " + anyEdat + (anyEdat == 1 ? " any" : " anys"));
        }

        // Comiat final
        System.out.println("Adéu " + nom);
    }
}



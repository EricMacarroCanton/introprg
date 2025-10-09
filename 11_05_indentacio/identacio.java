
/*     public class DosEnOrdre {             //Bloc 1: definició de la classe
    public static void main(String[] args) {   //Bloc 2: mètode principal
        
        // Bloc 3: lectura del primer número
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());

        // Bloc 4: lectura del segon número
        System.out.println("Segon?");
        int segon = Integer.parseInt(Entrada.readLine());

        // Bloc 5: estructura condicional
        if (primer <= segon) {
            System.out.println(primer + " i " + segon);
        } else {
            System.out.println(segon + " i " + primer);
        }
    }
}

┌─────────────────────────────────────────────┐
               Inici del programa            │
└─────────────────────────────────────────────┘
                      │
                     
          ┌────────────────────────────┐
        │ Mostra "Primer?"              │
        │ Llegeix primer número        │
        └────────────────────────────┘
                      │
                     
        ┌────────────────────────────┐
        │ Mostra "Segon?"            │
        │ Llegeix segon número       │
        └────────────────────────────┘
                      │
                      
        ┌────────────────────────────┐
        │ Compara: primer <= segon ? │
        └────────────────────────────┘
                                   
     (Sí)                         (No)
┌────────────────────┐       ┌────────────────────┐
│   Mostra "primer i   │       │ Mostra "segon i    │
│ segon"             │       │ primer"              │
└────────────────────┘       └────────────────────┘
           │                         │
           └───────────────┬─────────┘
                           
              ┌────────────────────────────┐
              │      Fi del programa         │
              └────────────────────────────┘


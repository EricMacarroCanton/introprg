public class Repas {
    public static void main(String[] args) {
        
       /*  //SUBSTRING
        String notes = "07.4509.9910.0005.00";
        
        /*
        String nota1 = notes.substring(0,5);    
        System.out.println(nota1);
        
        //pasem la nota a double
        double nota1d = Double.parseDouble(nota1);
        System.out.println(nota1d);
        
        String nota2 = notes.substring(5,10);    
        System.out.println(nota2);
        
        //pasem la nota a double
        double nota2d = Double.parseDouble(nota2);
        System.out.println(nota2d);
        
        String nota3 = notes.substring(10,15);    
        System.out.println(nota1);
        
        //pasem la nota a double
        double nota3d = Double.parseDouble(nota3);
        System.out.println(nota3d);
        
        String nota4 = notes.substring(15,20);    
        System.out.println(nota4);
        
        //pasem la nota a double
        double nota4d = Double.parseDouble(nota4);
        System.out.println(nota4d);
        
        double average = (nota1d + nota2d + nota3d + nota4d) / 4;
        System.out.println(average);

        
        //Solució
        //Instanciar array sabent que length() / 5 == longitud de l'array
        double[] arrayNotes = new double[notes.length() / 5];
        //for 1 en 1 o 4 en 4
        for (int i = 0; i < arrayNotes.length; i++) {
            //Agafar nota
            String nota = notes.substring(i * 5, i * 5 + 5);
            //Convertir a double
            double notaDouble = Double.parseDouble(nota);
            //Guardar al array
            arrayNotes[i] = notaDouble;
        }
        double avg = 0;
        for (int i = 0; i < arrayNotes.length; i++) {
            System.out.println(arrayNotes[i]);
            avg += arrayNotes[i];
        }
        avg /= arrayNotes.length;
        System.out.println("Mitjana: " + avg);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //XXX
    //ARAYS 2D MITJANES
    /*
    1 2 3 6
    4 3 2 5
    3 5 7 4
    */
   
    
    
      int[][] array2D = { 
            {1, 2, 3, 6}, 
            {4, 3, 2, 5}, 
            {3, 5, 7, 4} 
        };

        double[] resultat = mitjana(array2D);

        // Print del array resultat
          System.out.println("Mitjana línia " + mitjanaLinea);
        for (int i = 0; i < resultat.length; i++) {
            System.out.println("Mitjana línia " + i + ": " + resultat[i]);
        }
    }


    // Modul que retorna la mitjana d'una línia concreta
    public static double mitjanaLinia(int[][] array2D, int linia) {

        double suma = 0;

        for (int i = 0; i < array2D[linia].length; i++) {
            suma += array2D[linia][i];
        }

        return suma / array2D[linia].length;
    }


    // Modul que retorna un array amb la mitjana de cada línia
    public static double[] mitjana(int[][] array2D) {

        double[] resultat = new double[array2D.length];

        for (int i = 0; i < array2D.length; i++) {
            resultat[i] = mitjanaLinia(array2D, i);
        }

        return resultat;
    }
}

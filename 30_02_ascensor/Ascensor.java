public class Ascensor
 {
           int pis = -1;                // vides disponibles del gat Renat
           public static void main(String[] args) {
              Ascensor ascensor;           // declarem la referència al gat
               ascensor = new Ascensor();   // creem la instància del gat Renat.
               System.out.println("L'ascensor està a la planta " + ascensor.pis);
          }
      }

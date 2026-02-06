public class Mutabilitat {
   /**
    * @param nNums
    * @return un array amb nNums inicialitzat amb valors 1, 2, ..., nNums
    */
   public static int[] inicilitzaNums(int nNums) {
       int[] numeros = new int[nNums]; //instanciem. reservem espai
       for(int i=0; i<numeros.length; i++) {
           numeros[i] = i + 1;
       }
       return numeros;
   }


   public static void mostraEnUnaLinia(int[] nums) {
       for (int i = 0; i < nums.length; i++) {
           System.out.print(nums[i] + " ");
       }
       System.out.println();


   }




   public static void main(String[] args) {
       int[] nums = null;


       nums = inicilitzaNums(10);
       mostraEnUnaLinia(nums);
       //TODO
       // un modul que multipliqui per dos tots els nums
       mostraEnUnaLinia(nums); 












   }




}



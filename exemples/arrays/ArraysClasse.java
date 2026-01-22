public class ArraysClasse {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        double[] numerosDobles = new double[20];
        String[] texts = new String[5];

        numeros[0] = 5;
        numeros[1] = 10;
        numeros[2] = 15;
        numeros[3] = 20;
        numeros[4] = 25;
        numeros[5] = 30;
        numeros[6] = 35;
        numeros[7] = 40;
        numeros[8] = 45;
        numeros[9] = 50;

        int numero = numeros[2];
        System.out.println(numero);
        System.out.println(numeros[5]);

        texts[0] = "Red";
        texts[1] = "Yellow";
        texts[2] = "Blue";
        texts[3] = "Black";
        texts[4] = "Green";

        System.out.println(texts[2]);
        System.out.println(texts[3]);

        // Option 2
        int[] numparells = {2, 4, 6, 8, 10};
        System.out.println(numparells[4]);
        numparells[4] = 12;
        System.out.println(numparells[4]);

        String text = "Hello";
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

        System.out.println("Longitud array text: " + text.length());
        
      for (int i = 0; i < texts.length; i++) {
            System.out.println(texts[i]);
}
	int total = 0;
	    
      for (int xd = 0; xd < numeros.length; xd++) {
		total += numeros[xd];
		}
 System.out.println("La suma és " + total);

	

        }
    }


public class ExamenMetodes {
	public static void main(String[] args) {
   System.out.println("preu?");
      
        double preu = Integer.parseInt(Entrada.readLine());
           System.out.println("quant?");
        int quantitat = Integer.parseInt(Entrada.readLine());
                   System.out.println(total);
}

/* public static double total(double preu, int quantitat) {
	if (preu < 0 || quantitat < 0) {
	return -1
	} else {
	 	double total = preu * quantitat;
		return total;
			 }		
		}
	}
} */

public static double total(double preu, int quantitat) {
	if (preu < 0 || quantitat < 0) {
	return -1;
	} else {
	 	double total = preu * quantitat;
		return total;
			 }		
		}
	}

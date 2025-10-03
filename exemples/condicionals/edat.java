public class edat {
           public static void main(String[] args) {
           	System.out.println ("Entra l'edat : ");
           	int edat = Integer.parseInt(Entrada.readLine());
           	
           	//IF
           	if (edat >= 18) {
           		System.out.println("Ets major d'edat");
           	
           	}
           	else {
           		System.out.println("Ets menor d'edat");
           	}
           	
           	//IF-ELSE IF-ELSE
           	if (edat >= 100) {

           	System.out.println("FELICITATS!! WOW!!!!!");
           	} else if (edat >= 80) {
           	System.out.println("ets bastant gran!!");
           	} else if (edat >= 50) {
           	System.out.println("ja estas madur...");
           	} else if (edat >= 18) {
           	System.out.println("ets a la flor de la vida");
           	} else  {
           	System.out.println("ets menor!!");
           	}
           	
           System.out.println("Final");	
              	
           }
}

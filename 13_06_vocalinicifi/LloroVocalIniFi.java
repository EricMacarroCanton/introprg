/**
 * Programa LloroVocalIniFi
 * Demana paraules i només repeteix aquelles que comencen i acaben amb la mateixa vocal
 * (a, e, i, o, u), sense distingir majúscules ni minúscules.
 * Finalitza quan s’introdueix una cadena buida o només amb espais. 
 Eric Macarro
 */
public class LloroVocalIniFi { 
public static void main(String[] args) { 
System.out.println("Paraula?"); 
String paraula = Entrada.readLine(); 

	while (!paraula.isEmpty()) { 
	
        String text = paraula;
	char primera = text.charAt(0); 
	char darrera = text.charAt(text.length() - 1); 
	
		if ((primera == 'a' || primera == 'e' || primera == 'i' || primera == 'o' || primera == 'u'|| primera == 'A' || primera == 'E' || primera == 'I' || primera == 'O' || primera == 'U' )&& primera == darrera) { 
		System.out.println("Repeteixo: " + text); } 
		
		System.out.println("Paraula?"); 
		
		paraula = Entrada.readLine(); } 
		
System.out.println("Adéu"); 
} 
}

public class ForClasse {
public static void main (String[] args) {

int i = 5;

while (i <=10) {
	if (i > 4 || i < 9 ) {
	System.out.print(i + ", ");
	i++;
	
	 } else {
	 System.out.print(i + ". ");
	i++; }
		}
System.out.println(" ");
String resultat = "";
for (int x = 5; x <= 10; x++) {
resultat = resultat + x + " ";
		}
System.out.println(resultat);
	}	
}

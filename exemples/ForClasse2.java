public class ForClasse2 {
public static void main (String[] args) {
int c = 0;
int cont = 0;int total = 0;int total2 = 0;int mitjana = 0;
/* for (int i = 0; i <= 10; i++) {
if (i % 2 == 0) {

   c = i * 2;
   System.out.print(c + " ");
   cont = cont + c;
   }
else {
System.out.print(i + " ");
  cont = cont + i;
			}
			
		} 
		System.out.print(cont + " ");  
for (int f = 0; f <= 10; f++) {
if (f % 3 == 0) {
total = f * f * f;
total2 = total2 + total;
}
}
System.out.print("total és " + total2);
	}
}
*/
for (int f = 100; f >= 0; f-= 5) {
 

total2 = total2 + f;
cont++;
}
mitjana = total2 / cont;
System.out.println("total és " + total2);
System.out.println("mitjana és " + mitjana);
}
}


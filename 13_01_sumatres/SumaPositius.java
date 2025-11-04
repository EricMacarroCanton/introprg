/**
 * Programa SumaPositius
 * Llegeix tres valors enters introduïts per l'usuari i suma només els que siguin positius.
 * Finalment mostra el resultat de la suma.
 * ERIC MACARRO
 */
 public class SumaPositius {
    public static void main(String[] args) {

      
int suma = 0;  
int valor;

      
System.out.println("Introdueix el primer valor");
valor = Integer.parseInt(Entrada.readLine());
if (valor >= 0) {
	suma = suma + valor;
        }

        
System.out.println("Introdueix el segon valor");
valor = Integer.parseInt(Entrada.readLine());
if (valor >= 0) {
	suma = suma + valor;
        }


System.out.println("Introdueix el tercer valor");
valor = Integer.parseInt(Entrada.readLine());
if (valor >= 0) {
	suma = suma + valor;
        }

      
System.out.println("La suma és " + suma);
    }
}

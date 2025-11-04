/**
 * Programa SumaPositius
 * Demana tres valors enters i en calcula la suma només mentre siguin positius.
 * Si l’usuari introdueix un valor negatiu, el programa mostra la suma acumulada i s’atura.
 *Eric Macarrto
 */
 public class SumaPositius {
    public static void main(String[] args) {

	int suma = 0;
        int valor;

      
System.out.println("Introdueix el primer valor");
valor = Integer.parseInt(Entrada.readLine());
if (valor < 0) {
	System.out.println("La suma és " + suma);	
	return; 
        }
        suma = suma + valor;

        
System.out.println("Introdueix el segon valor");
valor = Integer.parseInt(Entrada.readLine());
if (valor < 0) {
	System.out.println("La suma és " + suma);
        return;
        }
suma = suma + valor;

        
System.out.println("Introdueix el tercer valor");
valor = Integer.parseInt(Entrada.readLine());
if (valor < 0) {
        System.out.println("La suma és " + suma);
        return;
        }
        suma = suma + valor;

       
System.out.println("La suma és " + suma);
    }
}


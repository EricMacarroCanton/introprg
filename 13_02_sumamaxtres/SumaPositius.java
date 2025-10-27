public class SumaPositius {
    public static void main(String[] args) {

        int suma = 0;
        int valor;

        // Primer valor
        System.out.println("Introdueix el primer valor:");
        valor = Integer.parseInt(Entrada.readLine());
        if (valor < 0) {
            System.out.println("La suma és " + suma);
            return; // acaba el programa
        }
        suma = suma + valor;

        // Segon valor
        System.out.println("Introdueix el segon valor:");
        valor = Integer.parseInt(Entrada.readLine());
        if (valor < 0) {
            System.out.println("La suma és " + suma);
            return;
        }
        suma = suma + valor;

        // Tercer valor
        System.out.println("Introdueix el tercer valor:");
        valor = Integer.parseInt(Entrada.readLine());
        if (valor < 0) {
            System.out.println("La suma és " + suma);
            return;
        }
        suma = suma + valor;

        // Mostrar resultat final
        System.out.println("La suma és " + suma);
    }
}


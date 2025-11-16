/*
 * Programa: SumaInterval
 * Autor: [Eric Macarro]
 *
 * Descripció:
 * Aquest programa llegeix dos nombres enters i calcula la suma de tots els nombres
 * entre ells, incloent-los. Mostra els càlculs intermedis, començant amb 0
 * i avançant sempre del menor al major, independentment de l'ordre d'entrada.
 */

public class SumaInterval {
    public static void main(String[] args) {
    
        System.out.println("primer?");
        int primer = Integer.parseInt(Entrada.readLine());

        System.out.println("segon?");
        int segon = Integer.parseInt(Entrada.readLine());

        int inici, fi;

        if (primer <= segon) {
            inici = primer;
            fi = segon;
        } else {
            inici = segon;
            fi = primer;
        }

        int suma = 0;

        for (int i = inici; i <= fi; i++) {
            System.out.println(suma + " + " + i + " = " + (suma + i));
            suma += i;
        }
    }
}


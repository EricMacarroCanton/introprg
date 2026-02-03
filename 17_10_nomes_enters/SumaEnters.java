//Desenvolupa un programa que a partir dels arguments que rebi per línia de comandes, mostri el resultat de sumar els enters que rebi.
public class SumaEnters {

    public static void main(String[] args) {

        int[] enters = filtraEnters(args);
        int suma = sumaEnters(enters);

        System.out.println(suma);
    }

    // Nombre d'enters dins l'array de Strings
    public static int quantsEnters(String[] valors) {

        int comptador = 0;

        for (int i = 0; i < valors.length; i++) {
            if (UtilString.esEnter(valors[i])) {
                comptador++;
            }
        }

        return comptador;
    }

    // Retorna un array amb només els enters
    public static int[] filtraEnters(String[] valors) {

        int quants = quantsEnters(valors);
        int[] resultat = new int[quants];

        int posicio = 0;

        for (int i = 0; i < valors.length; i++) {
            if (UtilString.esEnter(valors[i])) {
                resultat[posicio] = Integer.parseInt(valors[i]);
                posicio++;
            }
        }

        return resultat;
    }

    // Suma els valors de l'array
    public static int sumaEnters(int[] valors) {

        int suma = 0;

        for (int i = 0; i < valors.length; i++) {
            suma = suma + valors[i];
        }

        return suma;
    }
}


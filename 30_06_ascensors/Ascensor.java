//En aquesta ocasió disposarà d'una funció anomenada creaAscensorsEnEscala() que rebrà un nombre d'ascensors i retornarà un array amb el nombre d'ascensors especificat de manera que cada ascensor estarà en el pis indicat per la seva posició a l'array.
public class Ascensor {
    int pis;

    // Constructor
    public Ascensor(int pis) {
        this.pis = pis;
    }

    public static Ascensor[] creaAscensorsEnEscala(int quants) {
        Ascensor[] ascensors = new Ascensor[quants];
        for (int i = 0; i < quants; i++) {
            ascensors[i] = new Ascensor(i);
        }
        return ascensors;
    }

    public static void main(String[] args){
        if (args.length != 1) {
            return;
        }

        int quants = Integer.parseInt(args[0]);

        Ascensor[] ascensors = creaAscensorsEnEscala(quants);
        for (int i = 0; i < ascensors.length; i++) {
            System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
        }
    }
}

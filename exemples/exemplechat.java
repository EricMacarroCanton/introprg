public class ExempleVocals {
    public static void main(String[] args) {

        String paraula;

        while (true) {
            System.out.println("Introdueix una paraula (en blanc per acabar):");
            paraula = Entrada.readLine();

            if (paraula.isBlank()) {
                break; // sortir si està en blanc
            }

            int comptadorVocals = 0;
            int i = 0;

            paraula = paraula.toLowerCase(); // passem a minúscules

            // recórrer cada lletra amb un while
            while (i < paraula.length()) {
                char lletra = paraula.charAt(i);

                if (lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' || lletra == 'u') {
                    comptadorVocals++;
                }

                i++; // incrementem l’índex
            }

            System.out.println("La paraula \"" + paraula + "\" té " + comptadorVocals + " vocals.");
        }

        System.out.println("Programa acabat!");
    }
}


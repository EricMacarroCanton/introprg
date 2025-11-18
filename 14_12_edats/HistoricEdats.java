/*
Programa HistoricEdats: demana nom, edat i any actual i mostra l'edat any a any
Fins l'any anterior a l'actual i s'acomiada amb "Adéu nom"
Eric
*/
public class HistoricEdats {
    public static void main(String[] args) {
        System.out.println("nom?");
        String nom = Entrada.readLine();

        System.out.println("edat?");
        int edat = Integer.parseInt(Entrada.readLine());

        System.out.println("any actual?");
        int anyActual = Integer.parseInt(Entrada.readLine());

        // Comprovacions d'entrada
        if (nom.trim().isEmpty() || edat < 0 || anyActual < 1971) {
            System.out.println("Entrada incorrecta");
        } else {
            // Només seguim si l'entrada és correcta
            if (edat == 0) {
                System.out.println("Adéu " + nom);
            } else {
                int anyNaixement = anyActual - edat;

                // Mostrem any de naixement
                System.out.println("El " + anyNaixement + " vau néixer");

                // Mostrem edat any a any
                for (int i = 1; i < edat; i++) {
                    int any = anyNaixement + i;
                    int anyEdat = i;
                    System.out.println("El " + any + " teníeu " + anyEdat + (anyEdat == 1 ? " any" : " anys"));
                }

                // Comiat final
                System.out.println("Adéu " + nom);
            }
        }
    }
}


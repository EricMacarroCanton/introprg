public class HistoricEdats {
    public static void main(String[] args) {
        System.out.println("nom?");
        String nom = Entrada.readLine();

        System.out.println("edat?");
        int edat = Integer.parseInt(Entrada.readLine());

        System.out.println("any actual?");
        int anyActual = Integer.parseInt(Entrada.readLine());

        // Comprovacions d'entrada
        if (nom.isEmpty() || edat < 0 || anyActual < 1971) {
            System.out.println("Entrada incorrecta");
            return;
        }

        int anyNaixement = anyActual - edat;

        // Si l'edat és 0, només ens acomiadem
        if (edat == 0) {
            System.out.println("Adéu " + nom);
            return;
        }

        // Mostrem any de naixement
        System.out.println("El " + (anyNaixement - 1) + " vau néixer");

        // Mostrem edat any a any
        for (int i = 1; i < edat; i++) {
            int any = anyNaixement + i - 1;
            int anyEdat = i;
            System.out.println("El " + any + " teníeu " + anyEdat + (anyEdat == 1 ? " any" : " anys"));
        }

        // Comiat final
        System.out.println("Adéu " + nom);
    }
}


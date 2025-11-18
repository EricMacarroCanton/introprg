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

        boolean correcte = true;

        if (nom.length() == 0 || edat < 0 || anyActual < 1971) {
            System.out.println("Entrada incorrecta");
            correcte = false;
        }

        if (correcte) {
            if (edat == 0) {
                System.out.println("Adéu " + nom);
            } else {
                int anyNaixement = anyActual - edat;
                System.out.println("El " + anyNaixement + " vau néixer");
                for (int i = 1; i < edat; i++) {
                    int any = anyNaixement + i;
                    int edatAny = i;
                    System.out.println("El " + any + " teníeu " + edatAny + (edatAny == 1 ? " any" : " anys"));
                }
                System.out.println("Adéu " + nom);
            }
        }
    }
}


/**
 * Eric
 * Programa: Metge
 * Descripció:
 * Simula un metge atenent a un pacient. Pregunta els símptomes i depenent del que tingui,
 * recomana unes coses o altres.
 */
public class Metge {
    public static void main(String[] args) {

        System.out.println("Esternuts? (sí o no)");
        String esternuts = Entrada.readLine();

        if (esternuts.equals("sí")) {
            System.out.println("Mal de cap? (sí o no)");
            String malCap = Entrada.readLine();

            if (malCap.equals("sí")) {
                System.out.println("Problemes d'estómac? (sí o no)");
                String problemesEstomac = Entrada.readLine();

                if (problemesEstomac.equals("sí")) {
                    System.out.println("Pren paracetamol");
                } else {
                    System.out.println("Pren aspirina");
                }
            } else {
               
                System.out.println("Tos? (sí o no)");
                String tos = Entrada.readLine();

                if (tos.equals("sí")) {
                    System.out.println("Edat?");
                    int edat = Integer.parseInt(Entrada.readLine());
                    if (edat < 12) {
                        System.out.println("Pren un carmel de mel");
                    } else {
                        System.out.println("Pren un carmel d'eucaliptus");
                    }
                } else {
                    System.out.println("Vine a la consulta");
                }
            }
        } else {
            // No té esternuts: comprovem si té tos
            System.out.println("Tos? (sí o no)");
            String tos = Entrada.readLine();

            if (tos.equals("sí")) {
                System.out.println("Edat?");
                int edat = Integer.parseInt(Entrada.readLine());
                if (edat < 12) {
                    System.out.println("Pren un carmel de mel");
                } else {
                    System.out.println("Pren un carmel d’eucaliptus.");
                }
            } else {
                System.out.println("Vine a la consulta");
            }
        }
    }
}



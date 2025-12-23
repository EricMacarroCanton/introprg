//em de fer un programa que vagi demanant texts fins que un no contingui el darrer caràcter del text anterior. El primer text és acceptat sempre a menys que estigui buit.
public class ConteDarrer {
    public static void main(String[] args) {

        System.out.println("Introdueix texts (enter sol per finalitzar)");

        boolean seguit = true;
        char ultim = 0; // Guardarà l'últim caràcter de la línia anterior
        boolean primera = true; // Per controlar la primera línia

        while (seguit) {
            String actual = Entrada.readLine();

            // Sortir amb línia buida
            if (actual.length() == 0) {
                System.out.println("Adéu");
                seguit = false;
                continue;
            }

            if (primera) {
                // La primera línia s'accepta automàticament
                ultim = actual.charAt(actual.length() - 1);
                primera = false;
                continue;
            }

            boolean trobat = false;

            // Cercar només fins trobar el caràcter
            for (int i = 0; i < actual.length(); i++) {
                if (actual.charAt(i) == ultim) {
                    trobat = true;
                    break; // no cal seguir cercant
                }
            }

            if (trobat) {
                // Acceptada, actualitzem l'últim caràcter
                ultim = actual.charAt(actual.length() - 1);
            } else {
                System.out.println("Adéu");
                seguit = false;
            }
        }
    }
}


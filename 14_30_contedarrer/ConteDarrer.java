//em de fer un programa que vagi demanant texts fins que un no contingui el darrer caràcter del text anterior. El primer text és acceptat sempre a menys que estigui buit.
public class ConteDarrer {
    public static void main(String[] args) {

        System.out.println("Introdueix texts (enter sol per finalitzar)");

        boolean seguit = true;
        boolean primera = true;
        char ultim = 0;

        while (seguit) {
            String actual = Entrada.readLine();

            // Finalitzar amb línia buida
            if (actual.length() == 0) {
                System.out.println("Adéu");
                seguit = false;
                continue;
            }

            // Primera línia: acceptada sempre
            if (primera) {
                System.out.println("bé");
                ultim = Character.toLowerCase(
                        actual.charAt(actual.length() - 1));
                primera = false;
                continue;
            }

            boolean trobat = false;

            // Cercar el caràcter (sense distingir majúscules/minúscules)
            for (int i = 0; i < actual.length(); i++) {
                char c = Character.toLowerCase(actual.charAt(i));
                if (c == ultim) {
                    trobat = true;
                    break; // no cal seguir cercant
                }
            }

            if (trobat) {
                System.out.println("bé");
                ultim = Character.toLowerCase(
                        actual.charAt(actual.length() - 1));
            } else {
                System.out.println("Adéu");
                seguit = false;
            }
        }
    }
}


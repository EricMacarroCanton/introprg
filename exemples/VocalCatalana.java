public class VocalCatalana {
    public static void main(String[] args) {

        String VC = "aeiouàéèíïòóúüAEIOUÀÉÈÍÏÒÓÚÜ";
        boolean continuar = true;

        while (continuar) {
            System.out.println("Lletra (Enter per acabar)?");
            String paraula = Entrada.readLine();

            
            if (paraula.isBlank()) {
                continuar = false;
            } else {
                char c = paraula.charAt(0);

                if (Character.isLetter(c)) {

                    boolean esVocal = false;

                  
                    for (int i = 0; i < VC.length(); i++) {
                        if (VC.charAt(i) == c) {
                            esVocal = true;
                            
                        }
                    }

                    if (esVocal) {
                        System.out.println(c + " és una vocal catalana");
                    } else {
                        System.out.println(c + " no és una vocal catalana");
                    }

                } else {
                    System.out.println(c + " no és una lletra");
                }
            }
        }

        System.out.println("Programa acabat.");
    }
}



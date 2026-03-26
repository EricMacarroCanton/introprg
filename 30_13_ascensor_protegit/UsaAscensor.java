/* En aquesta ocasió protegirem les propietats de l'ascensor de manera que:

el pis sempre sigui un valor entre -1 i 10

el moviment sempre sigui un dels següents valors: aturat, pujant, baixant

Inicialment, l'ascensor començarà a la planta -1 i aturat */
public class UsaAscensor { 
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();

        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());


        if (args.length > 0) {

            if (esEnter(args[0])) {
                int nouPis = Integer.parseInt(args[0]);
                ascensor.setPis(nouPis);
            }
        }

        if (args.length > 1) {
            ascensor.setMoviment(args[1]);
        }

        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
    }


    public static boolean esEnter(String text) {
        if (text == null || text.isEmpty()) return false;

        int i = 0;
        if (text.charAt(0) == '-') i = 1;

        for (int l = 0; l < text.length(); l++) {
            if (!Character.isDigit(text.charAt(l))) {
                return false;
            }
        }
        return true;
    }
}

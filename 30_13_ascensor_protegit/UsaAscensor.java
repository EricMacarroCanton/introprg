/* En aquesta ocasió protegirem les propietats de l'ascensor de manera que:

el pis sempre sigui un valor entre -1 i 10

el moviment sempre sigui un dels següents valors: aturat, pujant, baixant

Inicialment, l'ascensor començarà a la planta -1 i aturat */

public class UsaAscensor { 
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();

        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());

        // Llegim des dels arguments
        int nouPis = Integer.parseInt(args[0]);
        String nouMoviment = args[1];

        ascensor.setPis(nouPis);
        ascensor.setMoviment(nouMoviment);

        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
    }
}

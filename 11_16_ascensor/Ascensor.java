/**
Eric
 * Programa: Ascensor
 * Descripció:
 * Simula un ascensor amb quatre pisos. Demana el pis actual i el botó
 * que es prem (pujar o baixar un nombre de pisos) i mostra el nou pis.
 * Mostra "error" si l'entrada és incorrecta o el moviment no és possible.
 */
public class Ascensor {
    public static void main(String[] args) {

        System.out.println("pis?");
        String pisActual = Entrada.readLine();

        System.out.println("botó?");
        String boto = Entrada.readLine();

        String nouPis = "error";

        if (pisActual.equals("planta baixa")) {
            if (boto.equals("pujar un")) nouPis = "primer pis";
            else if (boto.equals("pujar dos")) nouPis = "segon pis";
        } else if (pisActual.equals("primer pis")) {
            if (boto.equals("baixar un")) nouPis = "planta baixa";
            else if (boto.equals("pujar un")) nouPis = "segon pis";
        } else if (pisActual.equals("segon pis")) {
            if (boto.equals("baixar un")) nouPis = "primer pis";
            else if (boto.equals("pujar un")) nouPis = "error";
            else if (boto.equals("baixar dos")) nouPis = "planta baixa";
        } else if (pisActual.equals("golfes")) {
            if (boto.equals("baixar un")) nouPis = "error";
        }

        System.out.println(nouPis);
    }
}



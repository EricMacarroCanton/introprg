/**
Eric
 * Programa: Ascensor
 * Descripció:
 * Simula el funcionament d'un ascensor.
 * Demana el pis actual i el botó que es prem (pujar o baixar un pis)
 * i mostra el nou pis. Comprova que les entrades siguin correctes.
 * Si hi ha algun error (pis o botó incorrecte), mostra "error".
 */
public class Ascensor {
    public static void main(String[] args) {

        System.out.println("pis?");
        String pisActual = Entrada.readLine();

        System.out.println("botó?");
        String boto = Entrada.readLine();       

        String nouPis = "error";

        if (pisActual.equals("planta baixa")) {
            if (boto.equals("pujar un")) {
                nouPis = "primer pis";
            }
        } else if (pisActual.equals("primer pis")) {
            if (boto.equals("pujar un")) {
                nouPis = "segon pis";
            } else if (boto.equals("baixar un")) {
                nouPis = "planta baixa";
            }
        } else if (pisActual.equals("segon pis")) {
            if (boto.equals("pujar un")) {
                nouPis = "golfes";
            } else if (boto.equals("baixar un")) {
                nouPis = "primer pis";
            }
        } else if (pisActual.equals("golfes")) {
            if (boto.equals("baixar un")) {
                nouPis = "segon pis";
            }
        }

        System.out.println(nouPis);
    }
}


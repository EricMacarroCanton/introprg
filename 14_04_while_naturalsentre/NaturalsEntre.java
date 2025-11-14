/*
 * Llegeix un valor inicial, un final i un salt.
 * Comprova que tots siguin vàlids; si no, mostra error.
 * Si hi ha cap error, el programa s'atura sense demanar més entrades.
 * Si són correctes, imprimeix els nombres entre inicial i final.
 * Avança els valors utilitzant el salt indicat.
 * Eric Macarro
 */
public class NaturalsEntre {
    public static void main(String[] args) {

        boolean error = false;

        System.out.println("Valor inicial?");
        int inicial = Integer.parseInt(Entrada.readLine());

        if (inicial < 0) {
            System.out.println("Valor no vàlid");
            error = true;
        }

        int finalValor = 0;
        if (!error) {
            System.out.println("Valor final?");
            finalValor = Integer.parseInt(Entrada.readLine());

            if (finalValor < 0 || finalValor < inicial) {
                System.out.println("Valor no vàlid");
                error = true;
            }
        }

        int salt = 0;
        if (!error) {
            System.out.println("Salt?");
            salt = Integer.parseInt(Entrada.readLine());

            if (salt <= 0) {
                System.out.println("Valor no vàlid");
                error = true;
            }
        }

     
        if (!error) {
            int valor = inicial;
            while (valor <= finalValor) {
                System.out.println(valor);
                valor += salt;
            }
        }
    }
}


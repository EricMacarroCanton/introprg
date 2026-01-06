/*
En aquest exercici crearem un programa on es rebi una entrada que sigui una contrasenya i detecti si passa els criteris especificats al codi.
*/
public class Password {
    public static void main(String[] args) {

        String entradaPassword = Entrada.readLine();

        //variables
        int midaPassword = entradaPassword.length();

        //Llargaria
        if (midaPassword < 8 || midaPassword > 16) {
            System.out.println("El password ha de tenir entre 8 i 16 caràcters.");
            return;
        }

        //Minim un numero
        boolean conteNumero = false;
        for (int idx = 0; idx < midaPassword; idx++) {
            if (Character.isDigit(entradaPassword.charAt(idx))) {
                conteNumero = true;
                break;
            }
        }
        if (!conteNumero) {
            System.out.println("El password ha de contenir com a mínim un numero.");
            return;
        }

        //Majuscula
        boolean conteMajuscula = false;
        for (int idx = 0; idx < midaPassword; idx++) {
            if (Character.isUpperCase(entradaPassword.charAt(idx))) {
                conteMajuscula = true;
                break;
            }
        }
        if (!conteMajuscula) {
            System.out.println("El password ha de contenir com a mínim una lletra majúscula.");
            return;
        }

        //Minuscula
        boolean conteMinuscula = false;
        for (int idx = 0; idx < midaPassword; idx++) {
            if (Character.isLowerCase(entradaPassword.charAt(idx))) {
                conteMinuscula = true;
                break;
            }
        }
        if (!conteMinuscula) {
            System.out.println("El password ha de contenir com a mínim una lletra minúscula.");
            return;
        }

        //Simbol
        boolean conteSimbol = false;
        for (int idx = 0; idx < midaPassword; idx++) {
            if (!Character.isLetterOrDigit(entradaPassword.charAt(idx))) {
                conteSimbol = true;
                break;
            }
        }
        if (!conteSimbol) {
            System.out.println("El password ha de contenir com a mínim un símbol.");
            return;
        }

        //Majuscules >= Minuscules
        int comptaMajus = 0;
        int comptaMinus = 0;
        for (int idx = 0; idx < midaPassword; idx++) {
            char car = entradaPassword.charAt(idx);
            if (Character.isUpperCase(car)) comptaMajus++;
            else if (Character.isLowerCase(car)) comptaMinus++;
        }
        if (comptaMajus < comptaMinus) {
            System.out.println("El password no pot contenir menys majúscules que minúscules.");
            return;
        }

        //Espais en blanc
        boolean conteEspai = false;
        for (int idx = 0; idx < midaPassword; idx++) {
            if (entradaPassword.charAt(idx) == ' ') {
                conteEspai = true;
                break;
            }
        }
        if (conteEspai) {
            System.out.println("El password no pot contenir espais en blanc.");
            return;
        }

        //Caracters repetits
        for (int i = 0; i < midaPassword; i++) {
            char car = entradaPassword.charAt(i);

            boolean esVocal = car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u' || car == 'A' || car == 'E' || car == 'I' || car == 'O' || car == 'U';

            if (esVocal) continue;
            for (int j = i + 1; j < midaPassword; j++) {
                if (entradaPassword.charAt(j) == car) {
                    System.out.println("El password no pot contenir caràcters repetits.");
                    return;
                }
            }
        }

        //4 caracters seguits del mateix tipus
        int comptaMateixTipus = 1;
        for (int idx = 1; idx < midaPassword; idx++) {
            char prevCar = entradaPassword.charAt(idx - 1);
            char currCar = entradaPassword.charAt(idx);

            boolean mateixTipus = (Character.isDigit(prevCar) && Character.isDigit(currCar))
                    | (Character.isUpperCase(prevCar) && Character.isUpperCase(currCar))
                    || (Character.isLetter(prevCar) && !Character.isUpperCase(prevCar) && Character.isLetter(currCar) && !Character.isUpperCase(currCar))
                    || (!Character.isLetterOrDigit(prevCar) && !Character.isLetterOrDigit(currCar));

            if (mateixTipus) {
                comptaMateixTipus++;
                if (comptaMateixTipus > 4) {
                    System.out.println("El password no pot contenir més de 4 caràcters seguits del mateix tipus.");
                    return;
                }
            } else {
                comptaMateixTipus = 1;
            }
        }

        //3 numeros consecutius
        int comptaConsecutius = 1;
        for (int idx = 1; idx < midaPassword; idx++) {
            char prevCar = entradaPassword.charAt(idx - 1);
            char currCar = entradaPassword.charAt(idx);

            if (Character.isDigit(prevCar) && Character.isDigit(currCar) && (currCar == prevCar + 1 || currCar == prevCar - 1)) {
                comptaConsecutius++;
                if (comptaConsecutius > 3) {
                    System.out.println("El password no pot contenir més de 3 números consecutius.");
                    return;
                }
            } else {
                comptaConsecutius = 1;
            }
        }

        //Contrasenya correcte
        System.out.println("El maleït password és vàlid!");
    }
}


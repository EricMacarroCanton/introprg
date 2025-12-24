//programa on hem de desenvolupar un programa anomenat Password que demani una contrasenya i digui si és vàlida o no segons els criteris
public class Password {
    public static void main(String[] args) {
        System.out.println("Introdueix la contrasenya:");
        String pwd = Entrada.readLine();

        // 1. Comprovar longitud
        if (pwd.length() < 8 || pwd.length() > 16) {
            System.out.println("Longitud incorrecta");
            return;
        }

        // 2. Comprovar mínim un número
        boolean teNumero = false;
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') {
                teNumero = true;
                break;
            }
        }
        if (!teNumero) {
            System.out.println("Falta número");
            return;
        }

        // 3. Comprovar mínim una majúscula
        boolean teMajuscula = false;
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') {
                teMajuscula = true;
                break;
            }
        }
        if (!teMajuscula) {
            System.out.println("Falta majúscula");
            return;
        }

        // 4. Comprovar mínim una minúscula
        boolean teMinuscula = false;
        for (int i = 0; i < pwd.length(); i++) {
            char c = pwd.charAt(i);
            if ((c >= 'a' && c <= 'z') || (!Character.isUpperCase(c) && Character.isLetter(c))) {
                teMinuscula = true;
                break;
            }
        }
        if (!teMinuscula) {
            System.out.println("Falta minúscula");
            return;
        }

        // 5. Comprovar mínim un símbol
        boolean teSimbol = false;
        for (int i = 0; i < pwd.length(); i++) {
            char c = pwd.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                teSimbol = true;
                break;
            }
        }
        if (!teSimbol) {
            System.out.println("Falta símbol");
            return;
        }

        // 6. Comprovar majúscules >= minúscules
        int maj = 0, min = 0;
        for (int i = 0; i < pwd.length(); i++) {
            char c = pwd.charAt(i);
            if (c >= 'A' && c <= 'Z') maj++;
            else if (c >= 'a' && c <= 'z') min++;
        }
        if (maj < min) {
            System.out.println("Majúscules insuficients");
            return;
        }

        // 7. Comprovar espais
        for (int i = 0; i < pwd.length(); i++) {
            if (pwd.charAt(i) == ' ') {
                System.out.println("No pot contenir espais");
                return;
            }
        }

        // 8. Comprovar repeticions (excepte vocals)
        for (int i = 0; i < pwd.length(); i++) {
            char c = pwd.charAt(i);
            if ("aeiou".indexOf(Character.toLowerCase(c)) >= 0) continue;
            for (int j = i + 1; j < pwd.length(); j++) {
                if (c == pwd.charAt(j)) {
                    System.out.println("Caràcter repetit");
                    return;
                }
            }
        }

        // 9. Comprovar 4 caràcters seguits del mateix tipus
        int count = 1;
        for (int i = 1; i < pwd.length(); i++) {
            char tipusAnterior, tipusActual;

            // Determinar tipus anterior
            char c = pwd.charAt(i - 1);
            if (c >= '0' && c <= '9') tipusAnterior = 'N';
            else if (c >= 'A' && c <= 'Z') tipusAnterior = 'M';
            else if (c >= 'a' && c <= 'z') tipusAnterior = 'm';
            else tipusAnterior = 'S';

            // Determinar tipus actual
            c = pwd.charAt(i);
            if (c >= '0' && c <= '9') tipusActual = 'N';
            else if (c >= 'A' && c <= 'Z') tipusActual = 'M';
            else if (c >= 'a' && c <= 'z') tipusActual = 'm';
            else tipusActual = 'S';

            if (tipusActual == tipusAnterior) {
                count++;
                if (count > 4) {
                    System.out.println("Més de 4 caràcters seguits del mateix tipus");
                    return;
                }
            } else {
                count = 1;
            }
        }

        // 10. Comprovar més de 3 números consecutius
        int consecutius = 1;
        for (int i = 1; i < pwd.length(); i++) {
            char a = pwd.charAt(i - 1);
            char b = pwd.charAt(i);
            if (Character.isDigit(a) && Character.isDigit(b) && (b - a == 1)) {
                consecutius++;
                if (consecutius > 3) {
                    System.out.println("Més de 3 números consecutius");
                    return;
                }
            } else {
                consecutius = 1;
            }
        }

        System.out.println("Password vàlida");
    }
}


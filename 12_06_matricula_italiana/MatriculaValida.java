//exercici on ens demana una matrícula i que el programa ens digui si el que li ha introduït correspon a una matrícula italiana vàlida en el format vigent. Eric Macarro

public class MatriculaValida {
    public static void main(String[] args) {
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();

        if (matricula.length() != 7) {
            System.out.println("No és una matrícula italiana vàlida");
        } else {
            char c1 = matricula.charAt(0);
            char c2 = matricula.charAt(1);
            char d1 = matricula.charAt(2);
            char d2 = matricula.charAt(3);
            char d3 = matricula.charAt(4);
            char c3 = matricula.charAt(5);
            char c4 = matricula.charAt(6);

            boolean valid = true;

            // Lletres inicials
            if (!Character.isUpperCase(c1) || c1 == 'I' || c1 == 'O' || c1 == 'Q' || c1 == 'U' || c1 == 'À' || c1 == 'Á' || c1 == 'Â' || c1 == 'Ã' || c1 == 'Ä' || c1 == 'Å' || c1 == 'Æ' || c1 == 'Ç' || c1 == 'È' || c1 == 'É' || c1 == 'Ê' || c1 == 'Ë' || c1 == 'Ì' || c1 == 'Í' || c1 == 'Î' || c1 == 'Ï' || c1 == 'Ñ' || c1 == 'Ò' || c1 == 'Ó' || c1 == 'Ô' || c1 == 'Õ' || c1 == 'Ö' || c1 == 'Ø' || c1 == 'Ù' || c1 == 'Ú' || c1 == 'Û' || c1 == 'Ü' || c1 == 'Ý' || c1 == 'Ÿ') { valid = false; }

            if (!Character.isUpperCase(c2) || c2 == 'I' || c2 == 'O' || c2 == 'Q' || c2 == 'U' || c2 == 'À' || c2 == 'Á' || c2 == 'Â' || c2 == 'Ã' || c2 == 'Ä' || c2 == 'Å' || c2 == 'Æ' || c2 == 'Ç' || c2 == 'È' || c2 == 'É' || c2 == 'Ê' || c2 == 'Ë' || c2 == 'Ì' || c2 == 'Í' || c2 == 'Î' || c2 == 'Ï' || c2 == 'Ñ' || c2 == 'Ò' || c2 == 'Ó' || c2 == 'Ô' || c2 == 'Õ' || c2 == 'Ö' || c2 == 'Ø' || c2 == 'Ù' || c2 == 'Ú' || c2 == 'Û' || c2 == 'Ü' || c2 == 'Ý' || c2 == 'Ÿ') { valid = false; }

            // Dígits
            if (!Character.isDigit(d1)) { valid = false; }
            if (!Character.isDigit(d2)) { valid = false; }
            if (!Character.isDigit(d3)) { valid = false; }

            // Lletres finals
            if (!Character.isUpperCase(c3) || c3 == 'I' || c3 == 'O' || c3 == 'Q' || c3 == 'U' || c3 == 'À' || c3 == 'Á' || c3 == 'Â' || c3 == 'Ã' || c3 == 'Ä' || c3 == 'Å' || c3 == 'Æ' || c3 == 'Ç' || c3 == 'È' || c3 == 'É' || c3 == 'Ê' || c3 == 'Ë' || c3 == 'Ì' || c3 == 'Í' || c3 == 'Î' || c3 == 'Ï' || c3 == 'Ñ' || c3 == 'Ò' || c3 == 'Ó' || c3 == 'Ô' || c3 == 'Õ' || c3 == 'Ö' || c3 == 'Ø' || c3 == 'Ù' || c3 == 'Ú' || c3 == 'Û' || c3 == 'Ü' || c3 == 'Ý' || c3 == 'Ÿ') { valid = false; }

            if (!Character.isUpperCase(c4) || c4 == 'I' || c4 == 'O' || c4 == 'Q' || c4 == 'U' || c4 == 'À' || c4 == 'Á' || c4 == 'Â' || c4 == 'Ã' || c4 == 'Ä' || c4 == 'Å' || c4 == 'Æ' || c4 == 'Ç' || c4 == 'È' || c4 == 'É' || c4 == 'Ê' || c4 == 'Ë' || c4 == 'Ì' || c4 == 'Í' || c4 == 'Î' || c4 == 'Ï' || c4 == 'Ñ' || c4 == 'Ò' || c4 == 'Ó' || c4 == 'Ô' || c4 == 'Õ' || c4 == 'Ö' || c4 == 'Ø' || c4 == 'Ù' || c4 == 'Ú' || c4 == 'Û' || c4 == 'Ü' || c4 == 'Ý' || c4 == 'Ÿ') { valid = false; }

            // Resultat final
            if (valid) {
                System.out.println("És una matrícula italiana vàlida");
            } else {
                System.out.println("No és una matrícula italiana vàlida");
            }
        }
    }
}



//exercici on ens demana una matrícula i que el programa ens digui si el que li ha introduït correspon a una matrícula italiana vàlida en el format vigent. Eric Macarro

 public class MatriculaValida {
    public static void main(String[] args) {
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();

        // Comprovem la longitud
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
            if (!Character.isUpperCase(c1) || c1 == 'I' || c1 == 'O' || c1 == 'Q' || c1 == 'U'|| c1 == 'Ñ'|| c1 == 'À'|| c1 == 'Ä'|| c1 == 'Æ'|| c1 == 'Ç'|| c1 == 'È') { 
                valid = false;
            }
            if (!Character.isUpperCase(c2) || c2 == 'I' || c2 == 'O' || c2 == 'Q' || c2 == 'U'|| c2 == 'Ñ'|| c2 == 'À'|| c2 == 'Ä'|| c2 == 'Æ'|| c2 == 'Ç'|| c2 == 'È') {
                valid = false;
            }

            // Dígits del mig
            if (!Character.isDigit(d1)) {
                valid = false;
            }
            if (!Character.isDigit(d2)) {
                valid = false;
            }
            if (!Character.isDigit(d3)) {
                valid = false;
            }

            // Lletres finals
            if (!Character.isUpperCase(c3) || c3 == 'I' || c3 == 'O' || c3 == 'Q' || c3 == 'U' || c3 == 'Ñ'|| c3 == 'À'|| c3 == 'Ä'|| c3 == 'Æ'|| c3 == 'Ç'|| c3 == 'È') {
                valid = false;
            }
            if (!Character.isUpperCase(c4) || c4 == 'I' || c4 == 'O' || c4 == 'Q' || c4 == 'U'|| c4 == 'Ñ'|| c4 == 'À'|| c4 == 'Ä'|| c4 == 'Æ'|| c4 == 'Ç'|| c4 == 'È') {
                valid = false;
            }

            // Resultat final
            if (valid) {
                System.out.println("És una matrícula italiana vàlida");
            } else {
                System.out.println("No és una matrícula italiana vàlida");
            }
        }
    }
}


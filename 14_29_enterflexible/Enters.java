boolean esEnter = true;
boolean nomesEspais = true;
boolean signeTrobat = false;
boolean digitTrobat = false;

for (int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);

    if (c != ' ') {
        nomesEspais = false;
    }

    // Ignorar espais
    if (c == ' ') {
        continue;
    }

    // Signe només permès al principi i només un
    if (c == '+' || c == '-') {
        if (i != 0 || signeTrobat) {
            esEnter = false;
            break;
        }
        signeTrobat = true;
        continue;
    }

    // Dígit
    if (c >= '0' && c <= '9') {
        digitTrobat = true;
        continue;
    }

    // Qualsevol altra cosa → no és enter
    esEnter = false;
    break;
}

// Només espais o cap dígit → no és enter
if (nomesEspais || !digitTrobat) {
    esEnter = false;
}

                if (esEnter) {
                    System.out.println("\"" + text + "\" és enter");
                } else {
                    System.out.println("\"" + text + "\" no és enter");
                }
            }
        }
    }
}


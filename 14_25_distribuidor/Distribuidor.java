publpublic class Distribuidor {
    public static void main(String[] args) {
        System.out.println("Introduïu texts (INTRO per finalitzar)");
        String text = "a";

        // Trobades
        String vocalsT = "";
        String consonantsT = "";
        String simbolsT = "";
        String nombresT = "";

        // Comparadors
        String vc = "aàeèéiïoóòuúü";

        while (!text.isBlank()) {
            text = Entrada.readLine();
            if (text.isBlank()) break;

            String textMin = text.toLowerCase();

            for (int i = 0; i < textMin.length(); i++) {
                char c = textMin.charAt(i);
                boolean repetida = false;
                boolean esVocal = vc.indexOf(c) >= 0;

                // Lletres
                if (Character.isLetter(c) || c == 'ß') {
                    if (esVocal) {
                        for (int k = 0; k < vocalsT.length(); k++) {
                            if (c == vocalsT.charAt(k)) repetida = true;
                        }
                        if (!repetida) vocalsT += c;
                    } else { // consonant
                        for (int k = 0; k < consonantsT.length(); k++) {
                            if (c == consonantsT.charAt(k)) repetida = true;
                        }
                        if (!repetida) consonantsT += c;
                    }
                }

                // Nombres
                if (Character.isDigit(c)) {
                    for (int k = 0; k < nombresT.length(); k++) {
                        if (c == nombresT.charAt(k)) repetida = true;
                    }
                    if (!repetida) nombresT += c;
                }

                // Símbols
                if (!Character.isDigit(c) && !Character.isLetter(c) && c != ' ') {
                    for (int k = 0; k < simbolsT.length(); k++) {
                        if (c == simbolsT.charAt(k)) repetida = true;
                    }
                    if (!repetida) simbolsT += c;
                }
            }
        }

        if (!vocalsT.isBlank()) {
            System.out.println("Vocals: " + vocalsT.toUpperCase());
        }

        if (!consonantsT.isBlank()) {
            System.out.println("Consonants: " + consonantsT.toUpperCase());
        }

        if (!nombresT.isBlank()) {
            System.out.println("Nombres: " + nombresT);
        }

        if (!simbolsT.isBlank()) {
            System.out.println("Símbols: " + simbolsT);
        }
    }
}


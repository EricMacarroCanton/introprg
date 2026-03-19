/* Per provar algunes d'elles, desenvoluparem un programa que llegirà les dades d'un fitxer en format csv,
   i mostrarà la informació relativa a cada alumne que correspongui al criteri de cerca que s'indiqui per l'argument esperat.
*/
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class CercaAlumnes {

    static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;
    }

    public static Alumne construeixAlumne(String nom, String email,
                                          int edat, boolean esOient,
                                          int[] notes) {
        Alumne alumne = new Alumne();
        alumne.nom = nom;
        alumne.email = email;
        alumne.edat = edat;
        alumne.esOient = esOient;
        alumne.notes = notes;
        return alumne;
    }

    public static void mostraAlumne(Alumne alumne) {
        System.out.println("Alumne: " + alumne.nom);
        System.out.println("- email: " + alumne.email);
        System.out.println("- edat: " + alumne.edat);
        System.out.println("- és oïent: " + (alumne.esOient ? "Sí" : "No"));
        System.out.println("  - notes: " + notesACsv(alumne.notes));
    }

    public static String alumneAString(Alumne alumne) {
        return String.format(
                "Alumne(nom: \"%s\", email: \"%s\", " +
                "edat: %d, esOient: %b, notes: {%s})",
                alumne.nom, alumne.email, alumne.edat, alumne.esOient,
                notesACsv(alumne.notes));
    }

    public static String notesACsv(int[] notes) {
        if (notes == null || notes.length == 0) {
            return "";
        }

        String result = "";

        for (int i = 0; i < notes.length; i++) {
            if (i > 0) {
                result += ",";
            }

            if (notes[i] == -1) {
                result += "NP";
            } else {
                result += notes[i];
            }
        }

        return result;
    }

    public static String alumneACsv(Alumne alumne) {
        return alumne.nom + "," +
               alumne.email + "," +
               alumne.edat + "," +
               alumne.esOient + "," +
               notesACsv(alumne.notes);
    }

    public static Alumne csvAAlumne(String csv) {
        if (csv == null || csv.isEmpty()) {
            return null;
        }

        String[] parts = csv.split(",");

        Alumne alumne = new Alumne();

        alumne.nom = parts[0];
        alumne.email = parts[1];
        alumne.edat = Integer.parseInt(parts[2]);
        alumne.esOient = Boolean.parseBoolean(parts[3]);

        int[] notes = new int[parts.length - 4];
        for (int i = 4; i < parts.length; i++) {
            if (parts[i].equals("NP")) {
                notes[i - 4] = -1;
            } else {
                notes[i - 4] = Integer.parseInt(parts[i]);
            }
        }
        alumne.notes = notes;

        return alumne;
    }

 
public static void main(String[] args) throws IOException {
    if (args.length < 1) {
        System.out.println("Cal indicar un criteri de cerca");
        return;
    }

    String criteri = args[0];

    BufferedReader br = new BufferedReader(new FileReader("alumnes.csv"));

 
    br.readLine();

    String linia = br.readLine();

    while (linia != null) {
        Alumne alumne = csvAAlumne(linia);

        String nomLower = alumne.nom.toLowerCase();
        String emailLower = alumne.email.toLowerCase();
        String criteriLower = criteri.toLowerCase();

        if (nomLower.contains(criteriLower) ||
            emailLower.contains(criteriLower)) {

            mostraAlumne(alumne);
        }

        linia = br.readLine();
    }

    br.close();
}
}


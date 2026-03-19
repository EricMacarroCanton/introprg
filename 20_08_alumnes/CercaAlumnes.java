/*Per provar algunes d'elles, desenvoluparem un programa que llegirà les dades d'un fitxer en format csv, i mostrarà la informació relativa a cada alumne que correspongui al criteri de cerca que s'indiqui per l'argument esperat.
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
    System.out.println(alumneAString(alumne));
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
       Alumne alumne = new Alumne();
       return alumne;
     
    }

    public static void main(String[] args) throws IOException {
        // assegura que hi ha el criteri de cerca
        // XXX a completar

        // declaracions, inicialitzacions, apertura de fitxer, ignora línia de capçaleres, etc.
        // XXX a completar

        while (true) {
            // llegeix entrada i finalitza bucle si no en queden més
            // XXX a completar

            // converteix l'entrada a Alumne
            // XXX a completar

            // comprova si el criteri de cerca es troba dins del nom o
            // el email. Si és així, mostra'l
            // XXX a completar
        }
        // consideracions finals com ara el tancament del fitxer
        // XXX a completar
    }
}

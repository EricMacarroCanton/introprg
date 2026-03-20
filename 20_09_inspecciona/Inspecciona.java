/*Desenvolupa un programa que consideri els arguments de línia de comanda com si fossin camins del sistema de fitxer.

Per cada argument, comprovarà si correspon a un camí existent.

Si no existeix, indicarà "No trobat".*/
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Inspecciona {

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < args.length; i++) {
            String cami = args[i];

            System.out.println("Processant argument: " + cami);
            System.out.println("===========================");

            processarCami(cami);

            System.out.println();
        }
    }

    public static void processarCami(String cami) throws IOException {
        File f = new File(cami);

        if (!f.exists()) {
            System.out.println("No trobat");
            return;
        }

        mostrarPermisos(f);

        if (f.isDirectory()) {
            tractarDirectori(f);
        } else if (f.isFile()) {
            tractarFitxer(f);
        }
    }

    public static void mostrarPermisos(File f) {
        String permisos = "";

        permisos += f.canRead() ? "r" : "-";
        permisos += f.canWrite() ? "w" : "-";
        permisos += f.canExecute() ? "x" : "-";

        System.out.print(permisos + " ");
    }

    public static void tractarDirectori(File f) {
        String[] contingut = f.list();

        if (contingut == null || contingut.length == 0) {
            System.out.println("directori buit");
        } else {

            // Ordenació manual (Bubble Sort)
            for (int i = 0; i < contingut.length - 1; i++) {
                for (int j = 0; j < contingut.length - i - 1; j++) {
                    if (contingut[j].compareTo(contingut[j + 1]) > 0) {
                        String temp = contingut[j];
                        contingut[j] = contingut[j + 1];
                        contingut[j + 1] = temp;
                    }
                }
            }

            System.out.print("directori que conté: ");

            for (int i = 0; i < contingut.length; i++) {
                System.out.print(contingut[i]);

                if (i < contingut.length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println();
        }
    }

    public static void tractarFitxer(File f) throws IOException {

        if (f.length() == 0) {
            System.out.println("fitxer buit");
            return;
        }

        System.out.println("fitxer de mida en bytes: " + f.length());

        if (esLlegibleText(f)) {
            mostrarContingut(f);
        }
    }

    public static boolean esLlegibleText(File f) {
        String nom = f.getName();
        return f.canRead() && (nom.endsWith(".txt") || nom.endsWith(".java"));
    }

    public static void mostrarContingut(File f) throws IOException {
        System.out.println("Amb els continguts:");

        BufferedReader br = new BufferedReader(new FileReader(f));
        String linia;

        while ((linia = br.readLine()) != null) {
            System.out.println("|" + linia + "|");
        }

        br.close();
    }
}



/*Desenvolupa un programa que consideri els arguments de línia de comanda com si fossin camins del sistema de fitxer.

Per cada argument, comprovarà si correspon a un camí existent.

Si no existeix, indicarà "No trobat".*/
import java.io.File;
import java.util.Arrays;

public class Inspecciona {
    public static void main(String[] args) {

       for (int i = 0; i < args.length; i++) {
    String cami = args[i];

    System.out.println("Processant argument: " + cami);
    System.out.println("=============================");

    processarCami(cami);

    System.out.println();
}
	}		
public static void processarCami(String cami) {
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
}
	public static void tractarFitxer(File f) {
}

	public static void mostrarContingut(File f) {

}
}


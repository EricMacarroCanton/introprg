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
		

}
    }



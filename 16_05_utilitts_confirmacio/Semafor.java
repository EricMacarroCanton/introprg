/*
 * Programa: Semafor
 * Descripció: Abans de donar el consell del semàfor,
 * comprova si l'usuari és major d'edat.
 *
 * Autor: Eric Macarro
 */
public class Semafor {

    public static void main(String[] args) {

        if (!comprovarMajorEdat()) {
            System.out.println("No pots fer servir aquest programa sense supervisió");
            return;
        }

        mostrarConsell();
    }

    // MÒDUL: comprova si l'usuari és major d'edat
    public static boolean comprovarMajorEdat() {
        System.out.println("Ets major d'edat?");
        return UtilitatsConfirmacio.respostaABoolean();
    }

    // MÒDUL: gestiona el semàfor
    public static void mostrarConsell() {
        System.out.println("Color?");
        String color = Entrada.readLine();

        if (color.equals("groc")) {
            System.out.println("corre!");
        } else if (color.equals("vermell")) {
            System.out.println("espera");
        } else if (color.equals("verd")) {
            System.out.println("passa");
        } else {
            System.out.println("ves a l'oculista");
        }
    }
}



/**
 * Programa: DiaSetmanaSwitch
 * Objectiu: Convertir un número de dia (1-7) en el nom corresponent del dia de la setmana utilitzant switch expression.
 * Autor: Eric]
 * Data: [Data actual]

 */
 public class DiaSetmanaSwitch {
    public static void main(String[] args) {

        int day = Integer.parseInt(args[0]);

        String dayString = switch (day) {
            case 1 -> "Dilluns";
            case 2 -> "Dimarts";
            case 3 -> "Dimecres";
            case 4 -> "Dijous";
            case 5 -> "Divendres";
            case 6 -> "Dissabte";
            case 7 -> "Diumenge";
            default -> "Error";
        };

        System.out.println(dayString);
    }
}


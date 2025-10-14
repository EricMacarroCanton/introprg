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


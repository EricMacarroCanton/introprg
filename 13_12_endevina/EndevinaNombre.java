public class EndevinaNombre {
    public static void main(String[] args) {
        int nombrePensat = Integer.parseInt(args[0]); // el nombre a endevinar

        // Els intents es passen com a arguments següents
        for (int i = 1; i < args.length; i++) {
            int intent = Integer.parseInt(args[i]);
            
            if (intent < 1 || intent > 100) {
                System.out.println("Número fora de rang! Ha de ser entre 1 i 100.");
            } else if (intent < nombrePensat) {
                System.out.println("No has arribat.");
            } else if (intent > nombrePensat) {
                System.out.println("T'has passat.");
            } else {
                System.out.println("Has encertat!");
                break; // acabem quan encerta
            }
        }
    }
}



public class ExempleBucle {
    public static void main(String[] args) {
        String paraula;
        int comptador = 0;

        System.out.println("Paraula?");
        paraula = Entrada.readLine();

        while (!paraula.isBlank()) {
            if (paraula.length() >= 2) {
                char penultima = paraula.charAt(paraula.length() - 2);
                if (penultima == 'a') {
                    comptador++;
                }
            }

            System.out.println("Paraula?");
            paraula = Entrada.readLine();
        }

        System.out.println("Paraules amb penúltima lletra 'a' és " + comptador);
    }
}


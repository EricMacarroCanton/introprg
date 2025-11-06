public class exemplenumeros {
    public static void main(String[] args) {
        int num;
        int comptador0 = 0;
        int comptador1 = 0;
        int comptador2 = 0;
        int comptador3 = 0;
        int comptador4 = 0;
        int comptador5 = 0;
        int comptador6 = 0;
        int comptador7 = 0;
        int comptador8 = 0;
        int comptador9 = 0;
        int comptadorBlank = 0;
  
System.out.println("Introdueix un número (-1 per acabar):");
        String entrada = Entrada.readLine();
       while (entrada.isBlank()) {
            System.out.println("Introdueix un número (-1 per acabar):");
            entrada = Entrada.readLine();
        }

        num = Integer.parseInt(entrada);

        while (num != -1) {
            // comprovem quin número és
            if (num == 0) comptador0++;
            if (num == 1) comptador1++;
            if (num == 2) comptador2++;
            if (num == 3) comptador3++;
            if (num == 4) comptador4++;
            if (num == 5) comptador5++;
            if (num == 6) comptador6++;
            if (num == 7) comptador7++;
            if (num == 8) comptador8++;
            if (num == 9) comptador9++;

            // demanem un altre número
            System.out.println("Introdueix un número (-1 per acabar):");
            entrada = Entrada.readLine();

            // si és buit, simplement saltem a la següent iteració
            if (entrada.isBlank()) {
                continue; // torna al principi del while sense fer res
            }

            num = Integer.parseInt(entrada);
        }

        // resultats
        System.out.println("Has introduït " + comptador0 + " cops el 0");
        System.out.println("Has introduït " + comptador1 + " cops el 1");
        System.out.println("Has introduït " + comptador2 + " cops el 2");
        System.out.println("Has introduït " + comptador3 + " cops el 3");
        System.out.println("Has introduït " + comptador4 + " cops el 4");
        System.out.println("Has introduït " + comptador5 + " cops el 5");
        System.out.println("Has introduït " + comptador6 + " cops el 6");
        System.out.println("Has introduït " + comptador7 + " cops el 7");
        System.out.println("Has introduït " + comptador8 + " cops el 8");
        System.out.println("Has introduït " + comptador9 + " cops el 9");
    }
}

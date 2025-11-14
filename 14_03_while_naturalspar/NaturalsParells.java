public class NaturalsParells {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        boolean hiHaParells = false;
	int i = 1;
        // Mostrar els parells entre 1 i n
  while ( i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
                hiHaParells = true;
                i++;
              } else {
               i++;
                            }
        }

        // Si no n'hi ha cap
        if (!hiHaParells) {
            System.out.println("Cap valor parell creixent entre 1 i " + n);
        }
    }
}


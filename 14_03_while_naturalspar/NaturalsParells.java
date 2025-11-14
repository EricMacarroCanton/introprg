public class NaturalsParells {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        boolean hiHaParells = false;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                hiHaParells = true;
            }
        }

   
        }
    }





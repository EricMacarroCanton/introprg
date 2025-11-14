public class NaturalsParells {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        int i = 2;              // el primer número parell
        while (i <= n) {
            System.out.println(i);
            i += 2;             // passem al següent parell
        }
    }
}


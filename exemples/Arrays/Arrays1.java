public class Arrays1 {
    public static void main(String[] args) {
//Manera 1
        int[] aInt = new int[5];
        aInt[0] = 10;
        aInt[1] = 2;
        aInt[2] = -1;
        aInt[3] = 5;
        aInt[4] = 8;


        System.out.println(aInt[0]);
        System.out.println(aInt[1]);
        System.out.println(aInt[2]);
        System.out.println(aInt[3]);
        System.out.println(aInt[4]);


        double[] aDouble = new double[5];
        aDouble[0] = 10;
        aDouble[1] = 2;
        aDouble[2] = -1;
        aDouble[3] = 5;
        aDouble[4] = 8;


        String[] aString = new String[5];
        aString[0] = "Verd";
        aString[1] = "Blau";
        aString[2] = "Vermell";
        aString[3] = "Blanc";
        aString[4] = "Negre";

        char[] aChar = new char[5];
        aChar[0] = 'a';
        aChar[1] = 'b';
        aChar[2] = 'c';
        aChar[3] = 'd';
        aChar[4] = 'e';


        //Manera 2

        int[] aInt2 = {3, 4, 6, 7, 2, 1, 4, 15, 25, 333};
        System.out.println(aInt2[aInt2.length-1]);
        System.out.println(aInt2[8]);
        // for normal
        for (int i = 0; i < aInt2.length; i++) {
            System.out.println(aInt2[i]);
        }
        //for millorat (foreach)
        for (int value : aInt2) {
            System.out.println(value);
        }
        //Manera 3
        int[] aInt3 = new int[] {3, 4 ,5, 7 ,2 ,3 ,1, 0, 10};
        int total = 0;
        for (int i = 0; i < aInt3.length; i++) {
            total += aInt3[i];
            System.out.println("total actual: " + total);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("BMW", "BMW");
        Vehicle v2 = new Vehicle("Mercedes", "AMG");

        System.out.println(v1.getBrand());
        System.out.println(v1.Info());


	System.out.println(Vehicle.getidnext());
    }
}


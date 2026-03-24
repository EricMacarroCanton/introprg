public class Vehicle {

    private String brand;
    private String model;
    private static int idnext = 0;
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("He passat per Const1");
        idnext++;
    }

    public String getBrand() {
        return brand;
    }
    public static int getidnext(){
        
        return getidnext();
        
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String Info() {
        return brand + " " + model;
    }
}

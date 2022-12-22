public abstract class Vehicle{
    private String brand;
    private String model;
    private int wheels;
    private int doors;


    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public String getBrand() {
        return brand;
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

    abstract void drive();
    abstract void stop();

    public void showInfo(){
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println("Number of wheels: " + getWheels());
        System.out.println("Number of doors: " + getDoors());
    }

    Vehicle(String brand, String model,int wheels,int doors){
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.doors = doors;
    }

}
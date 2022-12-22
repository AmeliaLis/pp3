public class Truck extends Vehicle {
    private double gasTankCapacity;

    Truck(String brand, String model,int wheels,int doors, double gasTankCapacity){
        super(brand, model, wheels, doors);
        this.gasTankCapacity = gasTankCapacity;
    }

    public double getGasTankCapacity() {
        return gasTankCapacity;
    }

    public void setGasTankCapacity(double gasTankCapacity) {
        this.gasTankCapacity = gasTankCapacity;
    }

    public void drive(){
        System.out.println("The truck has started driving!");
    }

    public void stop(){
        System.out.println("The truck has stopped driving.");
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Capacity of the truck is: " + getGasTankCapacity());
    }
}

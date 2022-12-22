public class Bus extends Vehicle {
    private int seats;


    Bus(String brand, String model,int wheels,int doors, int seats){
        super(brand, model, wheels, doors);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }


    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void drive(){
        System.out.println("The bus has started driving!");
    }

    public void stop(){
        System.out.println("The bus has stopped driving.");
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Number of seats in the bus is: " + getSeats());
    }
}

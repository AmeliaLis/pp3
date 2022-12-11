public class Car extends Vehicle{
    private int maxSpeed;

    Car(int seats,int maxSpeed){
        super(seats);
        this.maxSpeed = maxSpeed;
    }

    public int[] spec(){
        int[] parameters = {getSeats(),getMaxSpeed()};
        return parameters;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public static void main(String[] args) {
        Car c = new Car(4,200);

        c.spec();
    }
}

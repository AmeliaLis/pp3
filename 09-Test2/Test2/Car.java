public class Car extends Vehicle {
    private int speed;

    Car(int seats, int speed) {
        super(seats);
        this.speed = speed;
    }

    public int[] spec() {
        int[] spec = {getSeats(), this.speed};
        return spec;
    }

    public int getSpeed() {
        return speed;
    }
}

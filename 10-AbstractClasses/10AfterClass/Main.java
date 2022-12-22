public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Suzuki","Vitara",4,5,"SUV");
        Truck t1 = new Truck("MAN","TGX",12,2,710);
        Bus b1 = new Bus("Solaris", "Urbino 12", 4, 3, 104);

        c1.drive();
        c1.showInfo();
        c1.stop();

        t1.drive();
        t1.showInfo();
        t1.stop();

        b1.drive();
        b1.showInfo();
        b1.stop();
    }
}

public class Lamp {
    boolean isSwitchedOn = false;

    public void SwitchOn() {
        isSwitchedOn = true;
    }

    public void SwitchOff() {
        isSwitchedOn = false;
    }

    public void DisplayInformation() {
        System.out.println("Is lamp switched on? " + isSwitchedOn);
    }

    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        lamp1.SwitchOn();
        
        Lamp lamp2 = new Lamp();
        lamp2.SwitchOff();

        lamp1.DisplayInformation();
        lamp2.DisplayInformation();
    }
}

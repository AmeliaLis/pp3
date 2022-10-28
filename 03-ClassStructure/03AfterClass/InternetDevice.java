public class InternetDevice {
    String deviceName;
    boolean isConnected = false;
    static int connectedDevices = 0;

    public void Connect() {
        this.isConnected = true;
        connectedDevices++;
    }

    public void Disconnect() {
        this.isConnected = false;
        connectedDevices--;
    }

    public void isConnected() {
        System.out.println("Is the device connected? " + this.isConnected);
    }

    public void DisplayStatus() {
        System.out.println("Name: " + this.deviceName);
        System.out.println("Is connected to the Internet? " + this.isConnected);
    }

    public static void DisplayConnections() {
        System.out.println("There are " + connectedDevices + " devices connected.");
    }


    public InternetDevice(String name) {
        this.deviceName = name;
    }

    public static void main(String[] args) {
        InternetDevice device1 = new InternetDevice("Laptop");
        InternetDevice device2 = new InternetDevice("Iphone");
        InternetDevice device3 = new InternetDevice("Thermomix");
        InternetDevice device4 = new InternetDevice("TV");
        InternetDevice device5 = new InternetDevice("Radio");

        device1.Connect();
        device2.Connect();
        device3.Connect();

        device1.DisplayStatus();
        device2.DisplayStatus();
        device3.DisplayStatus();
        device4.DisplayStatus();
        device5.DisplayStatus();

        DisplayConnections();

        device4.Connect();
        device4.DisplayStatus();

        DisplayConnections();

        device1.Disconnect();
        device1.DisplayStatus();

        DisplayConnections();
    }
}

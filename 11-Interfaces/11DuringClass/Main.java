public class Main {
    public static void main(String[] args) {
        TV t1 = new TV();
        /*
        t1.on();
        t1.displayStatus();
        t1.channelUp();
        t1.displayStatus();
        t1.setChannel(7);
        t1.displayStatus();
        t1.setChannel(142);
        t1.displayStatus();
        t1.channelDown();
        t1.displayStatus();
        t1.off();
        t1.displayStatus();
        t1.setChannel(50);
        t1.displayStatus();
        */
        t1.on();
        t1.displayProgramms();
        t1.displayStatus();
        t1.setChannel(15);
        t1.displayStatus();
        t1.volumeUp();
        t1.volumeUp();
        t1.volumeUp();
        t1.setChannel(8);
        t1.displayStatus();
        t1.volumeUp();
        t1.volumeUp();
        t1.setChannel(2);
        t1.displayStatus();
        t1.volumeUp();
        t1.setChannel(11);
        t1.displayStatus();
        t1.off();
        t1.displayStatus();
        t1.displayProgramms();
    }
}

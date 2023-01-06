import java.util.Arrays;
public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {
    private boolean isTurnedOn = false;
    private int channelNumber = 1;
    private int volumeLevel = 1;
    private String names [] = new String[99];

    public void displayProgramms(){
        names[0] ="tvp1";
        names[1] ="tvp2";
        names[2] ="tvp3";
        names[3] ="polsat";
        names[4] ="tvn";
        names[5] ="tv4";
        names[6] ="tv puls";
        names[7] ="tvp sport";
        names[8] ="eurosport";
        names[9] ="polsat sport";
        names[10] ="tvp historia";

        if (getIsTurnedOn() == true) {
            System.out.println("Available channels: ");
            for (String channel : this.names) {
                if (channel != null){
                    System.out.println(Arrays.asList(names).indexOf(channel)+1 + ": " + channel);
                }
            }
        }        
    }

    public String getChannelName(int n) {
        return names[n];
    }

    public void displayStatus(){
        if (getIsTurnedOn() == true) {
            System.out.println("TV is turned on. Channel: " + getChannelNumber() + " " + getChannelName(getChannelNumber()-1) + ". Volume: " +getVolumeLevel());
        } else {
            System.out.println("TV is turned off.");
        }
    }

    public boolean getIsTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }
    
    public void on(){
        setTurnedOn(true);
        setChannelNumber(1);
        setVolumeLevel(1);
    }

    public void off(){
        setTurnedOn(false);
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }

    public void channelDown(){
        if (getIsTurnedOn() == true) {
            if (getChannelNumber() == 1) {
                setChannel(99);;
            }
            this.channelNumber-=1;
        } else {
            System.out.println("Turn on the tv to change channel.");
        }
    }

    public void channelUp(){
        if (getIsTurnedOn() == true) {
            if (getChannelNumber() == 99) {
                setChannel(1);
            }
            this.channelNumber+=1;
        } else {
            System.out.println("Turn on the tv to change channel.");
        }
    }

    public void setChannel(int channelNumber){
        if (getIsTurnedOn() == true) {
            if (channelNumber >= 1 && channelNumber <= 99){
                this.channelNumber=channelNumber;
            } else {
                System.out.println("Channel out of range!");
            }
        } else {
            System.out.println("Turn on the tv to change channel.");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void volumeDown(){
        if (getIsTurnedOn()==true){
            if (getVolumeLevel() == 1) {
                System.out.println("Volume level is too low.");
            } else {
                this.volumeLevel-=1;
            }
        } else {
            System.out.println("Turn on tv to change the volume level.");
        }
    }

    public void volumeUp(){
        if (getIsTurnedOn() == true) {
            if((getVolumeLevel()==10)) {
                System.out.println("Volume level is too high.");
            } else {
                this.volumeLevel+=1;
            }
        } else {
            System.out.println("Turn on tv to change the volume level.");
        }
    }
}

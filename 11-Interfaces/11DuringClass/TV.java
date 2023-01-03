public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume {
    private boolean isTurnedOn = false;
    private int channelNumber = 1;
    private int volumeLevel = 1;

    public void displayStatus(){
        if (getIsTurnedOn() == true) {
            System.out.println("TV is turned on. Channel: " + getChannelNumber() + ". Volume: " +getVolumeLevel());
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

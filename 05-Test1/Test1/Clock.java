public class Clock {
    private int hour;
    private int minute;

    Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public void addMinute() {
        if ((this.minute == 59) && (this.hour == 23)) {
            this.minute = 0;
            this.hour = 0;
        } else if (this.minute == 59){
            this.minute = 0;
            this.hour += 1;
        } else {
            this.minute += 1;
        }
    }

    public static void main(String[] args) {
        Clock c = new Clock(3,59);
        c.setHour(9);
        c.setMinute(59);
        System.out.println(c.getHour());
        System.out.println(c.getMinute());
        c.addMinute();
        System.out.println(c.getHour());
        System.out.println(c.getMinute());
    }


    
}

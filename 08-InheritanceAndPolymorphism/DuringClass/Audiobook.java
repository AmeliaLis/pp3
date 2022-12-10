public class Audiobook extends Book{
    private int minutes;
    private int seconds;

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    Audiobook(String title, Publisher publisher, Writer writer, int yearOfPublication, int minutes, int seconds){
        super(title,publisher,writer,yearOfPublication);
        this.minutes = minutes;
        this.seconds = seconds;
    };

    public void display(){
        super.display();
        System.out.println("Minutes: " + getMinutes());
        System.out.println("Seconds: " + getSeconds());
    }
    
}

public class CinemaTicket {
    static String cinemaName = "Multikino";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    public void DisplayInfo() {
        System.out.println(cinemaName);
        System.out.println(filmTitle);
        System.out.println(row);
        System.out.println(seat);
        System.out.println(price + "$");
    }
    
    public static void main(String[] args) {
        CinemaTicket t1 = new CinemaTicket("Gladiator",2,10);
        t1.DisplayInfo();
        
        CinemaTicket t2 = new CinemaTicket("Gladiator",7,10);
        t2.DisplayInfo();
        //CinemaTicket ticket1 = new CinemaTicket();
        //ticket1.filmTitle = "Harry Potter";
        //ticket1.row = 10;
        //ticket1.seat = 12;
        //ticket1.price = 9.99;
        //ticket1.DisplayInfo();
        
        //CinemaTicket ticket2 = new CinemaTicket();
        //ticket2.filmTitle = "Władca Pierścieni";
        //ticket2.row = 11;
        //ticket2.seat = 20;
        //ticket2.price = 11.54;
        //ticket2.DisplayInfo();        
    }
    
    public CinemaTicket(String t, int r, int s) {
        this.filmTitle = t;
        this.row = r;
        this.seat = s;
        if (row <= 2){
            price = 10;
        } else {
            price = 25;
        }
    }
}

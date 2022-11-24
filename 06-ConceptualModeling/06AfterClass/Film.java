public class Film {
    private String title;
    private int yearOfPremiere;
    private String director;
    private int durationInMinutes;
    private int idFilm;
    private String type;

    Film(String title, String director, int yearOfPremiere, int durationInMinutes, int idFilm, String type){
        setTitle(title);
        setDirector(director);
        setYearOfPremiere(yearOfPremiere);
        setDurationInMinutes(durationInMinutes);
        setIdFilm(idFilm);
        setType(type);
    }

    

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getYearOfPremiere() {
        return yearOfPremiere;
    }
    public void setYearOfPremiere(int yearOfPremiere) {
        this.yearOfPremiere = yearOfPremiere;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getDurationInMinutes() {
        return durationInMinutes;
    }
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
    public int getIdFilm() {
        return idFilm;
    }
    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    };
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void displayFilmOnScreen(){};

    public void displayInfo(){
        System.out.println(getTitle() + ", " + getDirector() +", " + getIdFilm() +", " + getDurationInMinutes() +", " +getYearOfPremiere() +", "+getType()+".");

    }
    
    public void lend(){}

    public static void main(String[] args) {
        Film f1 = new Film("Zootopia", "Rich Moore, Byron Howard",2016,108,241291,"Animation");
        Film f2 = new Film("Star wars. The force awakens", "J.J. Abrams",2015,136,210921,"Science-Fiction");

        f1.displayFilmOnScreen();
        f1.displayInfo();
        
        f2.displayFilmOnScreen();
        f2.displayInfo();

    }




    
}

public class Writer {
    private String nameWriter;
    private String surnameWriter;
    private String literaryGenre;

    public String getNameWriter() {
        return nameWriter;
    }
    public void setNameWriter(String nameWriter) {
        this.nameWriter = nameWriter;
    }
    public String getSurnameWriter() {
        return surnameWriter;
    }
    public void setSurnameWriter(String surnameWriter) {
        this.surnameWriter = surnameWriter;
    }
    public String getLiteraryGenre() {
        return literaryGenre;
    }
    public void setLiteraryGenre(String literaryGenre) {
        this.literaryGenre = literaryGenre;
    }

    public void display(){
        System.out.println("Name writer: " +getNameWriter());
        System.out.println("Surname writer: " +getSurnameWriter());
        System.out.println("Literary genre: " +getLiteraryGenre());
    }

    public Writer(String nameWriter, String surnameWriter, String literaryGenre) {
        this.nameWriter = nameWriter;
        this.surnameWriter = surnameWriter;
        this.literaryGenre = literaryGenre;
    }

    
}

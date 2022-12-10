public class Book{
    private String title;
    private Publisher publisher;
    private int yearOfPublication;
    private Writer writer;

    Book(String title, Publisher publisher, Writer writer, int yearOfPublication) {
        this.title = title;
        this.publisher = publisher;
        this.writer = writer;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void display(){
        System.out.println("Title: " + getTitle());
        System.out.println("Year of publication: " + getYearOfPublication());
        System.out.println("Publisher: " + publisher.getNamePublisher() + ", City: " + publisher.getCity());
        System.out.println("Writer: " + writer.getNameWriter() + " " + writer.getSurnameWriter() + ", Literary genre: " + writer.getLiteraryGenre());
        
    }
}
public class Ebook extends Book {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    Ebook(String title, Publisher publisher, Writer writer, int yearOfPublication, String fileName){
        super(title,publisher,writer,yearOfPublication);
        this.fileName = fileName;
    }

    public void display(){
        super.display();
        System.out.println("Filename: " +getFileName());
    }
}

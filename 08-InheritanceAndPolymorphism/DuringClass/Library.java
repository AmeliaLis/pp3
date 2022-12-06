import java.util.ArrayList;

public class Library {
    private ArrayList<Book> shelf = new ArrayList<>();

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    public void display(){
        for (Book book:shelf){
            book.display();
            System.out.println();
        }
    }

    public void addBook(Book book){
        this.shelf.add(book);
    }

    public static void main (String[] args){
        Book b1 = new Book("Ksiazka","Jan Kowalski");
        Audiobook a1 = new Audiobook("Audiobook nr 1", "Teresa Nowak", 75, 32);
        Audiobook a2 = new Audiobook("Audiobook nr 2", "Teresa Kowalska", 57, 23);
        Ebook e1 = new Ebook("Ebook nr 1", "Natalia Wróbel", "Plik 1");
        Ebook e2 = new Ebook("Ebook nr 2", "Natalia Lis", "Plik 2");

        Library l1 = new Library();
        l1.addBook(b1);
        l1.addBook(a1);
        l1.addBook(a2);
        l1.addBook(e1);
        l1.addBook(e2);

        l1.display();
    }
}

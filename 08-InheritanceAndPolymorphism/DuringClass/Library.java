import java.util.ArrayList;

public class Library {
    private ArrayList<Book> shelf = new ArrayList<Book>();

    //Library(ArrayList<Book> shelf){
    //    this.shelf = shelf;
    //}
    
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
        Publisher p1 = new Publisher("PWN", "Warszawa");

        Book b1 = new Book("Ksiazka", new Publisher("Wydawnictwo 1", "Rzeszów"), new Writer("Amelia","Lis","kryminał"),2018);
        Audiobook a1 = new Audiobook("Audiobook nr 1", p1, new Writer("J.K.", "Rowling", "Fantastyka"), 1997, 75, 32);
        Audiobook a2 = new Audiobook("Audiobook nr 2", p1, new Writer("Karolina", "Kowalska", "Biografia"),1985, 57, 23);
        Ebook e1 = new Ebook("Ebook nr 1", p1, new Writer("Jan","Kowalski","Science-fiction"), 2001, "Plik 1");
        Ebook e2 = new Ebook("Ebook nr 2", p1, new Writer("Stasnisław","Leściecki","Dla dzieci"),2005,"Plik 2");


        // w przypadku tworzenia relacji agregacji między książką a wydawcą, nie muszę go wstawiać od razu Publisher do konstruktora (bo wtedy jest relacja kompozycji)
        // mogę to zrobić poprzez metodę b1.setPublisher(new Publisher("PWN","Warszawa"));


        Library l1 = new Library();
        l1.addBook(b1);
        l1.addBook(a1);
        l1.addBook(a2);
        l1.addBook(e1);
        l1.addBook(e2);

        l1.display();

        // lub inna możliwość
        // private ArrayList<Book> shelf = new ArrayList<Book>();
        // ArrayList<Book> books = new ArrayList<Book>();
        // books.add(book1);
        // books.add(book2);
        // books.add(book3);
        // Library library = new Library(books); - wtedy w konstruktorze, jako argument powinno wziąć ArryList<Book>
    }
}

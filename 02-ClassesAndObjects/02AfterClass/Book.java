public class Book {
    //Atrributes
    String title;
    int pages;
    String author;
    int year;

    //Methods
    public void DisplayTitle() {
        System.out.println("The title of the book is " + title);
    }

    public void DisplayInformation() {
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        System.out.println("Author: " + author);
        System.out.println("Year of publication: " + year);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "The Witcher";
        book1.pages = 489;
        book1.author = "Andrzej Sapkowski";
        book1.year = 1990;
        
        Book book2 = new Book();
        book2.title = "Kubuś Puchatek";
        book2.pages = 170;
        book2.author = "A. A. Milne";
        book2.year = 1926;

        book1.DisplayTitle();
        book1.DisplayInformation();

        book2.DisplayTitle();
        book2.DisplayInformation();
    }
    
}
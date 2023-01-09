public class Book {
    private String title;
    private int pages;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        if (pages>0) {
            this.pages=pages;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public static void main (String[] args) {
        Book b = new Book();
        b.setPages(4);
        System.out.println(b.getPages());
        b.setPages(-3);
        System.out.println(b.getPages());
        b.setTitle("ksiazeta");
        System.out.println(b.getTitle());
    }

}

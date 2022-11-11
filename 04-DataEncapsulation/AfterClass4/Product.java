public class Product {
    String productName;
    boolean isVegetarian;

    public void SetProductName(String productName) {
        this.productName = productName;
    }

    public void SetIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public String GetProductName() {
        return this.productName;
    }

    public boolean GetIsVegetarian() {
        return this.isVegetarian;
    }

    public static void main(String[] args) {
        Product p1 = new Product();

        p1.SetProductName("Skyr waniliowy");
        p1.SetIsVegetarian(true);

        System.out.println(p1.GetProductName());
        System.out.println(p1.GetIsVegetarian());
    } 

}
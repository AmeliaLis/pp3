import java.util.*;
public class Product implements Comparable<Product> {
    private String name;
    private float price;
    //nw ???

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.getName());
    }

    public static void main(String[] args) {
        ArrayList<Product> list1 = new ArrayList<Product>();

        list1.add(new Product("potato",2.99f));
        list1.add(new Product("milk",3.99f));
        list1.add(new Product("bread",4.99f));
        list1.add(new Product("beer",5.99f));

        for (Product product : list1){
            System.out.println(product.getName());
        }

        Collections.sort(list1);
        System.out.println();

        for (Product product : list1){
            System.out.println(product.getName());
        }
    }

}

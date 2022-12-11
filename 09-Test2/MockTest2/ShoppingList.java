import java.util.ArrayList;

public class ShoppingList {
    ArrayList<Product> list = new ArrayList<Product>();

    public void add(Product product){
        list.add(product);
    }

    public String toString(){
        String toString = "";
        for (Product product:list){
            toString += product.getName() +",";
        }
        return toString.substring(0,toString.length()-1);
    }

    public int total(){
        int counter=0;
        for (Product product:list){
            counter+=product.getQuantity();
        }
        return counter;
    }

    public static void main(String[] args) {
        ShoppingList s1 = new ShoppingList();

        Product p1 = new Product("milk",2);
        Product p2 = new Product("apple",4);

        s1.add(p1);
        s1.add(p2);

        System.out.println(s1.toString());
        System.out.println(s1.total());
    }
}

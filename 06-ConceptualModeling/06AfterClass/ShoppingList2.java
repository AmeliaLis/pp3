import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList2 {
    private ArrayList<String> shoppingList = new ArrayList<>();

    public void displaySize() {
        System.out.println("The list contains " + this.shoppingList.size() + " products.");
    }

    public void displayList() {
        if (this.shoppingList.size() == 0) {
            System.out.println("There are no products to display.");
        } else {
            String info = "The list of products contains: \n";
            for (String element : this.shoppingList) {
                info += element + "\n";
            }
            System.out.println(info);
        }
    }

    public void addProduct(String product) {
        this.shoppingList.add(product);
    }

    public void addProductFromKeyboard() {
        Scanner input = new Scanner(System.in);
        String productUser = input.nextLine();
        this.shoppingList.add(productUser);
    }

    public static void main(String[] args) {
        ShoppingList2 s1 = new ShoppingList2();

        s1.displayList();
        s1.displaySize();

        s1.addProductFromKeyboard();
        s1.addProductFromKeyboard();
        s1.displayList();
        s1.displaySize();
    }
}

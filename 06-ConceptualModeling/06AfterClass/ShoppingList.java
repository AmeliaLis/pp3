import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    ArrayList<String> shoppingList;

    ShoppingList(ArrayList<String> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public void displaySize() {
        System.out.println("There is " + this.shoppingList.size() + " products on the list.");
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
        ArrayList<String> shoppingList = new ArrayList<>();
        ShoppingList s1 = new ShoppingList(shoppingList);

        // s1.displaySize();
        // s1.displayList();
        // s1.addProduct("Milk");
        // s1.displaySize();
        // s1.displayList();

        // s1.addProduct("Eggs");
        // s1.addProduct("Butter");
        // s1.addProduct("Water");
        // s1.displaySize();
        // s1.displayList();

        s1.addProductFromKeyboard();
        s1.displayList();
        s1.displaySize();

        s1.addProductFromKeyboard();
        s1.addProductFromKeyboard();
        s1.addProductFromKeyboard();

        s1.displayList();
        s1.displaySize();

    }
}

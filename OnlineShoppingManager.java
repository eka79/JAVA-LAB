package OnlineShoppingManager;
import java.util.Vector;

public class OnlineShoppingManager {
    private Vector<Product> inventory;

    public OnlineShoppingManager() {
        inventory = new Vector<Product>();
    }
    public void addProduct(String name, double price, String category) {
        Product product = new Product(name, price, category);
        inventory.add(product);
    }
    public void removeProduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equals(name)) {
                inventory.remove(i);
                break;
            }

        }
    }
    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : inventory) {
            System.out.println("Name: " + product.name + ", Price: " + product.price + ", Category: " + product.category);
        }
    }
    public static void main(String[] args) {
        OnlineShoppingManager manager = new OnlineShoppingManager();

        manager.addProduct("Laptop",1000,"Electronics");
        manager.addProduct("T-Shirt",20,"Clothing");
        manager.addProduct("Book",10,"Books");

        manager.displayProducts();
        manager.removeProduct("Book");
        manager.displayProducts();
        manager.removeProduct("T-Shirt");
        manager.displayProducts();

    }
}

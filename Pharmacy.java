package Pharmacy_manager;
import java.util.ArrayList;

public class Pharmacy {
    public final int id;
    public final String name;
    public int quantity;
    public double price;

    public Pharmacy(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Item=" + id + ", Name=" + name + ", Quantity=" + quantity + ", Price=" + price;
    }
}

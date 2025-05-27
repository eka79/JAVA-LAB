package Pharmacy_manager;

import java.util.ArrayList;

public class PharmacyManagementSystem {
    private ArrayList<Pharmacy> inventory = new ArrayList<>();

    public void addItem(Pharmacy p) {
        inventory.add(p);
    }
    public void updateItem(int id, int quantity,double price) {
        for(Pharmacy p : inventory) {
            if(p.id == id) {
                p.quantity = quantity;
                p.price = price;
                break;
            }
        }
    }
    public void removeItem(int id) {
        inventory.removeIf(item->item.id==id);
    }
    public void displayAll() {
        for(Pharmacy p : inventory) {
            System.out.println(p);
        }
    }
    public Pharmacy searchItemByID(int id) {
        for (Pharmacy item : inventory) {
            if (item.id == id) {
                return item;
            }
        }
        return null; // Item not found
    }
    public static void main(String[] args) {
        PharmacyManagementSystem ims = new PharmacyManagementSystem();
        // Adding sample items
        ims.addItem(new Pharmacy(1, "Crocin", 100, 2.5));
        ims.addItem(new Pharmacy(2, "Calpol", 50, 3.0));
        ims.addItem(new Pharmacy(3, "Crickmol", 200, 1.0));
// Displaying inventory
        ims.displayAll();
// Updating an item
        ims.updateItem(1, 90, 2.0);
// Displaying inventory after update
        ims.displayAll();
// Searching for an item
        System.out.println("Searching for item with ID 2:");
        Pharmacy foundItem = ims.searchItemByID(2);
        if (foundItem != null) {
            System.out.println("Item found: " + foundItem.name);
        } else {
            System.out.println("Item not found.");
        }
// Removing an item
        ims.removeItem(2);
// Displaying inventory after removal
        ims.displayAll();
    }

}


import java.util.ArrayList;

public class Store {
    // Attribute
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    // Constructor
    public Store() {
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc disc) {
        // Add the DVD to the store
        itemsInStore.add(disc);

        // Notify
        System.out.println("The DVD has been added");
    }

    // Method to remove a DVD from the store
    public void removeDVD(DigitalVideoDisc disc) {
        // Search for the DVD
        int indexOfRemoved = itemsInStore.indexOf(disc);

        // If the DVD is not found
        if (indexOfRemoved == -1) {
            System.out.println("The DVD is not found");
            return;
        }

        // Remove the DVD
        itemsInStore.remove(indexOfRemoved);

        // Notify
        System.out.println("The DVD has been removed");
    }

    // Getters and Setters
    public ArrayList<DigitalVideoDisc> getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(ArrayList<DigitalVideoDisc> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }
}


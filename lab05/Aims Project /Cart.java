import Lab04.AimsProject.Media.DigitalVideoDisc;
import Lab04.AimsProject.Media.Media;
import java.util.ArrayList;
import java.util.List;

// Class representing a shopping cart for media items
public class Cart {
    // Attributes
    private List<Media> itemsOrdered = new ArrayList<Media>();
    private int numOfDVDs;

    // Constructor to initialize the cart
    public Cart() {
        numOfDVDs = 0;
    }

    // Method to add a new media item to the cart
    public void addMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            System.out.println("Media is already in the cart"); // Media already in the cart
            return;
        }
        itemsOrdered.add(media);
        if (media instanceof DigitalVideoDisc) {
            numOfDVDs++;
        }
        System.out.println("Media added to the cart"); // Media successfully added
    }

    // Method to remove a media item from the cart
    public void removeMedia(Media media) {
        int indexOfRemoved = itemsOrdered.indexOf(media);

        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("Media not found in the cart"); // Media not found in the cart
            return;
        }

        // Remove
        itemsOrdered.remove(indexOfRemoved);
        if (media instanceof DigitalVideoDisc) {
            numOfDVDs--;
        }

        System.out.println("Media removed from the cart"); // Media successfully removed
    }

    // Method to calculate the total cost of items in the cart
    public double totalCost() {
        float cost = 0;
        for (Media media : itemsOrdered) {
            cost += media.getCost();
        }

        return Math.round(cost * 100.0) / 100.0;
    }

    // Method to print details of items in the cart, including their cost and the
    // total cost
    public void printCart() {
        System.out.println("--------------------------------CART--------------------------------");
        System.out.println("Ordered Items:");
        for (Media media : itemsOrdered) {
            media.print();
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("----------------------------------------------------------------");
    }

    // Method to search for media in the cart by ID and display the search results
    public Media searchByID(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                return media;
            }
        }
        System.out.println("Media not found in the cart by ID"); // Media not found by ID
        return null;
    }

    // Method to search for media in the cart by title
    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        System.out.println("Media not found in the cart by title"); // Media not found by title
        return null;
    }

    // Method to sort items in the cart by title and print the sorted cart
    public void sortByTitle() {
        itemsOrdered.sort(Media.COMPARE_BY_TITLE);
        printCart();
    }

    // Method to sort items in the cart by cost and print the sorted cart
    public void sortByCost() {
        itemsOrdered.sort(Media.COMPARE_BY_COST);
        printCart();
    }

    // Getters and setters

    public int getNumOfDVDs() {
        return numOfDVDs;
    }

    public void setNumOfDVDs(int numOfDVDs) {
        this.numOfDVDs = numOfDVDs;
    }
}

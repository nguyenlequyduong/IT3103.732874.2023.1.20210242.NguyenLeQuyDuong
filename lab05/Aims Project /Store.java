import Lab04.AimsProject.Media.Media;
import java.util.ArrayList;
import java.util.List;

// Class representing a store that manages media items
public class Store {
    // Attribute
    private List<Media> itemsInStore = new ArrayList<Media>();

    // Constructor to initialize the store
    public Store() {
    }

    // Method to add a media item to the store
    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Media is already in the store"); // Media already in the store
            return;
        }
        itemsInStore.add(media);
        System.out.println("Media added to the store"); // Media successfully added
    }

    // Method to remove a media item from the store
    public void removeMedia(Media media) {
        int indexOfRemoved = itemsInStore.indexOf(media);

        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("Media not found in the store"); // Media not found in the store
            return;
        }

        // Remove
        itemsInStore.remove(indexOfRemoved);

        System.out.println("Media removed from the store"); // Media successfully removed
    }

    // Method to print details of all items in the store
    public void printStore() {
        System.out.println("-----------------------STORE-----------------------");
        System.out.println("Items in store:");
        for (Media media : itemsInStore) {
            media.print();
        }
        System.out.println("----------------------------------------------");
    }

    // Method to search for media in the store by title
    public Media searchByTitle(String title) {
        for (Media media: itemsInStore) {
            if (media.isMatch(title)) {
                return media;
            }
        }
        System.out.println("Media not found in the store by title"); // Media not found by title
        return null;
    }

    // Getters and setters

    public List<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(List<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }
}

import java.util.Comparator;

// Comparator for sorting Media objects by title
class MediaComparatorByTitle implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        return media1.getTitle().compareTo(media2.getTitle());
    }
}

// Comparator for sorting Media objects by cost
class MediaComparatorByCost implements Comparator<Media> {
    @Override
    public int compare(Media media1, Media media2) {
        return Double.compare(media1.getCost(), media2.getCost());
    }
}

// Abstract class representing a media item
public abstract class Media {
    // Attributes
    private int id;
    private String title;
    private String category;
    private float cost;

    // Static comparators for sorting media items
    public static final Comparator<Media> COMPARE_BY_TITLE =
            new MediaComparatorByTitle();
    public static final Comparator<Media> COMPARE_BY_COST =
            new MediaComparatorByCost();

    // Constructors
    public Media(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    // Method to print a media item
    public void print() {
        // Implementation for printing media details
    }

    // Method to check if the media title matches a given title
    public boolean isMatch(String title) {
        return title.equals(this.title);
    }

    // Override equals method to compare media objects based on title
    @Override
    public boolean equals(Object o) {
        if (o instanceof Media media) {
            return title.equals(media.getTitle());
        }
        return false;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}

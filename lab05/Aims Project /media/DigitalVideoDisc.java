// Class representing a Digital Video Disc
public class DigitalVideoDisc extends Disc implements Playable {

    // Constructors for different scenarios
    public DigitalVideoDisc(int id, String title) {
        super(id, title);
    }

    public DigitalVideoDisc(int id, String title, String category, float cost) {
        // Call the base constructor with id and title
        this(id, title);
        // Set additional attributes for category and cost
        this.setCategory(category);
        this.setCost(cost);
    }

    public DigitalVideoDisc(int id, String title, String category, String director, float cost) {
        // Call the constructor with id, title, category, and cost
        this(id, title, category, cost);
        // Set additional attribute for director
        this.setDirector(director);
    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        // Call the constructor with id, title, category, director, and cost
        this(id, title, category, director, cost);
        // Set additional attribute for length
        this.setLength(length);
    }

    // Method to print details of a DVD
    @Override
    public void print() {
        System.out.println(getId() + ". DVD - "
                + getTitle() + " - "
                + getCategory() + " - "
                + getDirector() + " - "
                + getLength() + " minutes: "
                + getCost() + "$");
    }

    // Method to play a DVD
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength() + " minutes");
    }
}


public class DigitalVideoDisc {
    // Attributes
    private int id; // Unique identifier for each DVD
    private String title; // Title of the DVD
    private String category; // Category or genre of the DVD
    private String director; // Director of the DVD
    private int length; // Duration or length of the DVD in minutes
    private double cost; // Cost of the DVD in dollars

    private static int nbDigitalVideoDiscs = 0; // Total number of DigitalVideoDisc objects created

    // Constructors
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, double cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, double cost) {
        this(title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this(title, category, director, cost);
        this.length = length;
    }

    // Method to print information about a DVD
    public void printDVD() {
        System.out.println(id + ". DVD - "
                + title + " - "
                + category + " - "
                + director + " - "
                + length + " minutes: "
                + cost + "$");
    }

    // Method to check if the title of a DVD matches a given title
    public boolean isMatch(String title) {
        return title.equals(this.title);
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public double getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }
}


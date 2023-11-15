public class DigitalVideoDisc {
    // Attribute: Các thuộc tính của đĩa DVD
    private String title;     // Tiêu đề đĩa DVD
    private String category;  // Thể loại của đĩa DVD
    private String director;  // Đạo diễn của đĩa DVD
    private int length;       // Độ dài của đĩa DVD (phút)
    private float cost;       // Giá của đĩa DVD

    private static int nbDigitalvideoDiscs = 0;

    // Constructor: Các constructor để tạo đối tượng đĩa DVD với các thông tin khác nhau
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director, cost);
        this.length = length;
    }

    // Getter và Setter cho các thuộc tính
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}

import java.util.ArrayList;
import java.util.List;

// Class representing a Compact Disc
public class CompactDisc extends Disc implements Playable {
    // Attribute
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    // Constructor
    public CompactDisc(int id, String title, String category, float cost,
            String director, int length, String artist) {
        super(id, title, category, cost, director, length);
        this.artist = artist;
    }

    // Method to add a track
    public void addTrack(Track track) {
        int indexOfTrack = tracks.indexOf(track);
        if (indexOfTrack != -1) {
            System.out.println("Track is already in the list"); // Track is already in the CD
            return;
        }
        tracks.add(track);
        System.out.println("Track added"); // Track successfully added
    }

    // Method to remove a track
    public void removeTrack(Track track) {
        int indexOfTrack = tracks.indexOf(track);
        if (indexOfTrack == -1) {
            System.out.println("Track is absent in the list"); // Track is not in the CD
            return;
        }
        tracks.remove(indexOfTrack);
        System.out.println("Track removed"); // Track successfully removed
    }

    // Method to get the total length of the CD
    @Override
    public int getLength() {
        int length = 0;
        for (Track track : tracks) {
            length += track.getLength();
        }
        setLength(length);
        return length;
    }

    // Method to play the CD
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD artist: " + artist);
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }

    // Method to print information about the CD
    @Override
    public void print() {
        System.out.println(getId() + ". CD - "
                + getTitle() + " - "
                + getCategory() + " - "
                + getDirector() + " - "
                + artist + " - "
                + getLength() + ": "
                + getCost() + "$");
    }

    // Getter and Setter
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}


public class StoreTest {
    public static void main(String[] args) {
        // Create a new store
        Store store = new Store();

        // Create new DVD objects and add them to the store
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin",
                "Animation", 18.99f);
        store.addDVD(dvd3);

        // Remove a DVD successfully
        store.removeDVD(dvd1);

        // Attempt to remove a non-existing DVD
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter",
                "Fiction", 18.99f);
        store.removeDVD(dvd4);
    }
}


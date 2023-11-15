package lab03.AimsProject;

public class CartTest {
    public static void main(String[] args) {
        // Create a new cart object
        Cart cart = new Cart();

        // Create a new DVD with details and add it to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        // Create another DVD with details and add it to the cart
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        // Create a third DVD with minimal details and add it to the cart
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin",
                "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // Display the contents of the cart
        cart.printCart();

        // Test the search methods
        // Search for a DVD by its ID (existing and non-existing)
        cart.searchByID(1);
        cart.searchByID(4);

        // Search for a DVD by its title (existing and non-existing)
        cart.searchByTitle("Star Wars");
        cart.searchByTitle("Harry Potter");
    }
}

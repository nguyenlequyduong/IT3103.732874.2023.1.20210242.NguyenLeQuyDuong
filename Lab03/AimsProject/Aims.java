

public class Aims {
    public static void main(String[] args) {
        // Instantiate a new shopping cart
        Cart anOrder = new Cart();

        // Add new DVD items to the shopping cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // Display the number of DVDs in the shopping cart
        System.out.println("Number of DVDs in the shopping cart: ");
        System.out.println(DigitalVideoDisc.getNbDigitalVideoDiscs());

        // Retrieve and print the ID of dvd3
        System.out.println("ID of dvd3 is: ");
        System.out.println(dvd3.getId());
    }
}

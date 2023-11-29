public class Cart {
    // Attributes
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    public static final int MAX_NUMBERS_ORDERED = 20;

    // Constructor
    public Cart() {
        setQtyOrdered(0);
    }

    // Setters and Getters
    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(DigitalVideoDisc[] itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    // Method to add a new DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // Check if the cart is almost full
        if (getQtyOrdered() >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }

        // Increase the qtyOrdered
        setQtyOrdered(getQtyOrdered() + 1);

        // Add the DVD to the cart
        DigitalVideoDisc[] newItemsOrdered = getItemsOrdered();
        newItemsOrdered[getQtyOrdered() - 1] = disc;
        setItemsOrdered(newItemsOrdered);

        // Notify
        System.out.println("The disc has been added");
    }

    // Method to add a list of new DVDs to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        // Check if the cart is almost full
        if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }

        // Add the DVDs to the cart
        System.arraycopy(dvdList, 0, itemsOrdered, qtyOrdered, dvdList.length);

        // Increase the qtyOrdered
        qtyOrdered += dvdList.length;

        // Notify
        System.out.println("The list has been added");
    }

    // Method to add two new DVDs to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        // Check if the cart is almost full
        if (qtyOrdered >= MAX_NUMBERS_ORDERED - 1) {
            System.out.println("The cart is almost full");
            return;
        }

        // Increase the qtyOrdered
        qtyOrdered += 2;

        // Add the DVDs to the cart
        itemsOrdered[qtyOrdered - 2] = dvd1;
        itemsOrdered[qtyOrdered - 1] = dvd2;

        // Notify
        System.out.println("The discs have been added");
    }

    // Method to remove a DVD from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        // Search for the disc
        int indexOfRemoved = -1;
        DigitalVideoDisc[] newItemsOrdered = getItemsOrdered();
        for (int i = 0; i < getQtyOrdered(); i++) {
            if (newItemsOrdered[i] != null && newItemsOrdered[i].equals(disc)) {
                indexOfRemoved = i;
                break;
            }
        }

        // If the disc is not found
        if (indexOfRemoved == -1) {
            System.out.println("The disc is not found");
            return;
        }

        // Remove the disc
        for (int i = indexOfRemoved; i < getQtyOrdered() - 1; i++) {
            newItemsOrdered[i] = newItemsOrdered[i + 1];
        }
        setQtyOrdered(getQtyOrdered() - 1);
        newItemsOrdered[getQtyOrdered()] = null;
        setItemsOrdered(newItemsOrdered);

        // Notify
        System.out.println("The disc has been removed");
    }

    // Method to calculate the total cost of all DVDs in the cart
    public double totalCost() {
        double cost = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null) {
                cost += disc.getCost();
            }
        }

        return Math.round(cost * 100.0) / 100.0;
    }

    // Method to print the list of ordered items in the cart, including the price of
    // each item and the total cost
    public void printCart() {
        System.out.println("-----------------------CART-----------------------");
        System.out.println("Ordered Items:");
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd != null)
                dvd.printDVD();
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("--------------------------------------------------");
    }

    // Method to search for DVDs in the cart by ID and display the search results
    public void searchByID(int id) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd != null && dvd.getId() == id) {
                found = true;
                dvd.printDVD();
            }
        }
        if (!found) {
            System.out.println("Not found!");
        }
    }

    // Method to search for DVDs in the cart by title and print the results
    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc dvd : itemsOrdered) {
            if (dvd != null && dvd.isMatch(title)) {
                found = true;
                dvd.printDVD();
            }
        }
        if (!found) {
            System.out.println("Not found!");
        }
    }
}

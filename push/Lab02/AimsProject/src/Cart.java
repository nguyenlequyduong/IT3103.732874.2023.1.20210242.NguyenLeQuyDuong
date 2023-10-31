public class Cart {
    // Attribute: Mảng lưu trữ các đĩa DVD trong giỏ hàng
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    
    // Số lượng đĩa DVD hiện có trong giỏ hàng
    private int qtyOrdered;
    
    // Hằng số xác định số lượng tối đa của đĩa DVD trong giỏ hàng
    public static final int MAX_NUMBERS_ORDERED = 20;

    // Constructor: Khởi tạo giỏ hàng với số lượng đĩa DVD bằng 0
    public Cart() {
        setQtyOrdered(0);
    }

    // Setter and Getter cho thuộc tính qtyOrdered
    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    // Setter and Getter cho thuộc tính itemsOrdered
    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(DigitalVideoDisc[] itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    // Method to add a new DVD
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // Kiểm tra xem giỏ hàng đã đầy chưa
        if (getQtyOrdered() >= 20) {
            System.out.println("The cart is almost full");
            return;
        }

        // Tăng số lượng đĩa DVD trong giỏ hàng
        setQtyOrdered(getQtyOrdered() + 1);

        // Thêm đĩa DVD vào giỏ hàng
        DigitalVideoDisc[] newItemsOrdered = getItemsOrdered();
        newItemsOrdered[getQtyOrdered() - 1] = disc;
        setItemsOrdered(newItemsOrdered);

        // Thông báo
        System.out.println("The disc has been added");
    }

    // Method to remove a DVD
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        // Tìm kiếm đĩa DVD cần xóa
        int indexOfRemoved = -1;
        DigitalVideoDisc[] newItemsOrdered = getItemsOrdered();
        for (int i = 0; i < getQtyOrdered(); i++) {
            if (newItemsOrdered[i].equals(disc)) {
                indexOfRemoved = i;
                break;
            }
        }

        // Nếu không tìm thấy
        if (indexOfRemoved == -1) {
            System.out.println("The disc is not found");
            return;
        }

        // Xóa đĩa DVD
        for (int i = indexOfRemoved; i < getQtyOrdered() - 1; i++) {
            newItemsOrdered[i] = newItemsOrdered[i + 1];
        }
        setQtyOrdered(getQtyOrdered() - 1);
        newItemsOrdered[getQtyOrdered() - 1] = null;
        setItemsOrdered(newItemsOrdered);

        // Thông báo
        System.out.println("The disc has been removed");
    }

    // Method to calculate the total cost
    public double totalCost() {
        double cost = 0;
        DigitalVideoDisc[] itemsOrdered = getItemsOrdered();
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null) {
                cost += disc.getCost();
            }
        }

        // Làm tròn đến hai chữ số thập phân
        return Math.round(cost * 100.0) / 100.0;
    }
}

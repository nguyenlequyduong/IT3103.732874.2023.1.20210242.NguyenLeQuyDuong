public class Aims {
    public static void main(String[] args) {
        // Tạo một giỏ hàng mới
        Cart anOrder = new Cart();

        // Tạo các đối tượng DVD và thêm chúng vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // In tổng chi phí của các sản phẩm trong giỏ hàng
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // Xóa DVD1 khỏi giỏ hàng
        anOrder.removeDigitalVideoDisc(dvd1);

        // In tổng chi phí của các sản phẩm trong giỏ hàng sau khi xóa
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());
    }
}
//new branch abc

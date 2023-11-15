public class StoreTest {
    public static void main(String[] args) {
        // Tạo một đối tượng Store để quản lý các DVD
        Store store = new Store();

        // Tạo DVD "The Lion King" và thêm vào cửa hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);

        // Tạo DVD "Star Wars" và thêm vào cửa hàng
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);

        // Tạo DVD "Aladin" và thêm vào cửa hàng
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        store.addDVD(dvd3);

        // Xóa DVD "The Lion King" khỏi cửa hàng
        store.removeDVD(dvd1);

        // Tạo DVD "Harry Potter" nhưng không thêm vào cửa hàng (vì đã xóa "The Lion
        // King")
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Harry Potter",
                "Fiction", 18.99f);
        store.removeDVD(dvd4);
    }
}

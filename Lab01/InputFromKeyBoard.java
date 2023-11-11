import java.util.Scanner;

public class InputFromKeyBoard {
    public static void main(String[] args) {
        // Tạo duonmột đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập tên
        System.out.println("What's your name?");
        String strName = sc.nextLine(); // Đọc chuỗi ký tự từ bàn phím

        // Yêu cầu người dùng nhập tuổi
        System.out.println("How old are you?");
        int iAge = sc.nextInt(); // Đọc số nguyên từ bàn phím

        // Yêu cầu người dùng nhập chiều cao
        System.out.println("How tall are you (m)?");
        double dHeight = sc.nextDouble(); // Đọc số thực từ bàn phím

        // Hiển thị thông tin đã nhập
        System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. Your height is " + dHeight + " meters.");
    }
}

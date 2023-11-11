import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Nhập số hàng cho tam giác

        // Duyệt qua từng hàng của tam giác
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng bên trái (n - i khoảng trắng)
            System.out.print(" ".repeat(n - i));

            // In sao (2 * i - 1 sao)
            System.out.print("*".repeat(2 * i - 1));

            // In khoảng trắng bên phải (n - i khoảng trắng)
            System.out.print(" ".repeat(n - i));

            // Xuống dòng cho hàng tiếp theo
            System.out.println();
        }
    }
}

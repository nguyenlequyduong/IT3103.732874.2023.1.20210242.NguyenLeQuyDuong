import java.util.Scanner;

public class DayOfMonth {
    // Hàm kiểm tra xem một năm có phải là năm nhuận
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Nhập tháng từ người dùng
            System.out.println("Enter the month (1-12):");
            int month = scanner.nextInt();

            // Kiểm tra tính hợp lệ của tháng
            if (month < 1 || month > 12) {
                System.out.println("Invalid month. Please enter a month from 1 to 12.");
                continue; // Quay lại vòng lặp để nhập lại
            }

            // Nhập năm từ người dùng
            System.out.println("Enter the year:");
            int year = scanner.nextInt();

            // Kiểm tra tính hợp lệ của năm
            if (year <= 0) {
                System.out.println("Invalid year. Please enter a positive year.");
            } else {
                // Sử dụng câu lệnh switch để kiểm tra số ngày trong tháng
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("The month has 31 days.");
                    case 4, 6, 9, 11 -> System.out.println("The month has 30 days.");
                    case 2 -> {
                        // Xử lý tháng 2 riêng biệt để kiểm tra năm nhuận
                        if (isLeapYear(year)) {
                            System.out.println("The month has 29 days (leap year).");
                        } else {
                            System.out.println("The month has 28 days.");
                        }
                    }
                    default -> System.out.println("Invalid month.");
                }
                break; // Kết thúc chương trình sau khi hiển thị kết quả
            }
        }
        scanner.close(); // Đóng Scanner
    }
}



import java.util.Scanner;

public class DayOfMonth {
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the month");
            int month = scanner.nextInt();
            System.out.println("Enter the year");
            int year = scanner.nextInt();
            if (month < 0 || month > 12) {
                System.out.println("Invalid month");
                continue;
            }
            if (year <= 0) {
                System.out.println("Invalid year");
            } else {
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("The month has 31 days");
                    case 2 -> {
                        if (isLeapYear(year))
                            System.out.println("The month has 29 days");
                        else
                            System.out.println("The month has 28 days");
                    }
                    default -> System.out.println("The month has 30 days");
                }
                break;
            }
        }
    }
}
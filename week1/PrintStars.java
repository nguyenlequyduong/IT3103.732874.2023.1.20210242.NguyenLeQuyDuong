
import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
            System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1) + " ".repeat(n-i));
    }
}
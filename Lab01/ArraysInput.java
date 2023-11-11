import java.util.Arrays;
import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử trong mảng
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Tạo một mảng số nguyên có kích thước n
        int[] arr = new int[n];

        // Nhập n phần tử cho mảng2
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(arr);

        // Tính tổng các phần tử trong mảng
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        // Hiển thị mảng đã sắp xếp, tổng và trung bình cộng
        System.out.println("The sorted array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum + "; Average: " + (double) sum / n);
    }
}

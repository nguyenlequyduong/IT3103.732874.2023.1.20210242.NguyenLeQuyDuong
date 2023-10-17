
import java.util.Arrays;
import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        System.out.println("The sorted array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum + "; Average: " + (double) sum / n);
    }
}
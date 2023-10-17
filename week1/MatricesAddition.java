

import java.util.Scanner;

public class MatricesAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("Enter number of rows of each matrix: ");
        m = sc.nextInt();
        System.out.print("Enter number of columns of each matrix: ");
        n = sc.nextInt();
        int[][] arr1 = new int[m][n], arr2 = new int[m][n], arr3 = new int[m][n];
        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr1[i][j] = sc.nextInt();
        System.out.println("Enter the second matrix: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr2[i][j] = sc.nextInt();
        System.out.println("The sum of two matrices: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = arr2[i][j] + arr1[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
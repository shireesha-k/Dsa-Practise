package java_internal;

import java.util.Scanner;

public class summat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        // Sum of each row
        System.out.println("Row sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++)
                rowSum += matrix[i][j];
            System.out.println("Row " + (i + 1) + " sum = " + rowSum);
        }

        // Sum of each column
        System.out.println("Column sums:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++)
                colSum += matrix[i][j];
            System.out.println("Column " + (j + 1) + " sum = " + colSum);
        }

    }
}
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};  // Sample array

        System.out.print("Enter the value to search: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(target + " is found in the array.");
        else
            System.out.println(target + " is NOT found in the array.");
    }
}

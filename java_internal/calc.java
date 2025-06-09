package java_internal;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Choose an operation: 1.Addition 2. Subtraction 3. Multiplication 4. Division");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        } 
        
    }
}

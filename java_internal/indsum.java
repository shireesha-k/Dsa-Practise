package java_internal;

import java.util.Scanner;

public class indsum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println("The sum of the digits is: " + sum);

    }
}

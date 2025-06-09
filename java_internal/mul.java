package java_internal;

import java.util.Scanner;

public class mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numeber");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"X"+i+"="+(n*i));
        }
    }
}

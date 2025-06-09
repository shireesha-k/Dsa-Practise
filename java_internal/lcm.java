package java_internal;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their LCM:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int lcm=0;
        for(int i=Math.max(a,b);i<a*b;i++){
            if(i%a==0 && i%b==0){
                lcm=i;
                break;
            }
        }
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}

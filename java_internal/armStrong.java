package java_internal;

import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        int digits=String.valueOf(n).length();
        while(temp>0){
            int digit=temp%10;
            sum+=Math.pow(digit,digits);
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not an Armstrong number");
        }
    }
}

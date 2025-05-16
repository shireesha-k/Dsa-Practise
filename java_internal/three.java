package java_internal;
import java.util.Scanner;
public class three {
    public static void main(String[] args){
        int [] a=new int [20],b=new int [20];
        System.out.println("enter the sizeof the arrays");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter elements in the first array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter elements in the Second array");
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i]==b[j]){
                    System.out.println("The common element is "+a[i]);
                    break;
                }
            }
        }
    }
}

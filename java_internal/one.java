package java_internal;
import java.util.Scanner;

public class one {
    public static void main(String[] args){
        int [] arr=new int [20];
        int n=arr.length;
        java.util.Scanner sc=new Scanner(System.in);
        
        n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be removed:");
        int remove=sc.nextInt();
        int pos=-1;
        for(int i=0;i<n;i++){
           if(arr[i]==remove){
            pos=i;
            break;
           }
        }
       if(pos==-1){
        System.out.println("Elemnet not founfd in the arrat");;
       }else{
        for(int i=pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
       }
       for(int i=0;i<n;i++){
        System.out.print( arr[i]+" ");
       }
    }
}

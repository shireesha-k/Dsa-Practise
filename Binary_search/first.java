import java.util.Scanner;
public class first {
    public static int bs(int arr[],int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,4,6,8,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your target");
        int target=sc.nextInt();
        int ans=bs(arr,target);
        System.out.println(ans);
        sc.close();
    }
}

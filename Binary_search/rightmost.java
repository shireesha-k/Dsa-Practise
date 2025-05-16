public class rightmost {
   public static int rightMost(int [] arr,int target){
    int l=0;
    int r=arr.length-1;
    while(l<=r){
        int mid=l+(r-l)/2;
        if(arr[mid]==target){
            l=mid+1;
        }else if(arr[mid]>target){
            r=mid-1;
        }else{
            l=mid+1;
        }
    }
    return r;
   }
    public static void main(String[] args) {
        int [] arr={1,3,3,3,3,5};
        int target=3;
        int ans=rightMost(arr, target);
        System.out.println(ans);
    }
}

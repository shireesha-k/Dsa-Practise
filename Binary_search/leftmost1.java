public class leftmost1 {
    public int leftMost(int [] arr,int target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=target){
                r=mid-1;
            }else{
                l=mid+1;
            }

        }
        return l;
    }
    public static void main(String[] args) {
        leftmost1 obj=new leftmost1();
        int arr[]={0,0,0,0,0,1,1,1,1,0,0};
        System.out.println(obj.leftMost(arr, 1));
    }
}

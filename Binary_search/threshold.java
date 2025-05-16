public class threshold {
    public static  boolean isPossible(int [] arr,int threshold,int n){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            sum=a/n;
            if(a%n!=0){
                sum++;
            }
            threshold-=sum;
            if(threshold<0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        int arr []={1,2,5,9};
        int l=0;
        int r=1000000;
        int threshold=6;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(arr,threshold,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }

        System.out.println(l);
    }
}

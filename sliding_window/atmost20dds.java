public class atmost20dds {
    public static void main(String[] args) {
        int [] arr={12,1,3,1,1,6,7,1,8,1};
        int r=0;
        int l=0;
        int temp=0;
        int ans=0;
        for(r=0;r<arr.length;r++){
            if(arr[r]%2!=0){
                temp++;
            }
            while(temp>2){
                if(arr[l]%2==1){
                temp-=1;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}

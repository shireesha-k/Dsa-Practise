public class atmost2 {
    public static void main(String[] args) {
        int[] arr={0,1,3,1,1,6,7,1,0,1};
        int r=0;
        int l=0;
        int temp=0;
        int ans=0;
        for(r=0;r<arr.length;r++){
            if(arr[r]==1){
                temp++;
            }

            while(temp>2){
                if(arr[l]==1){
                 temp--;
                }
                l++;
            }
        ans=Math.max(ans,r-l+1);
        }

         System.out.println(ans);
    }
}

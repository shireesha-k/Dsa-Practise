public class minimum {
    public static void main(String[] args) {
        int [] arr={1,0,1,1,0};
        int r=0;
        int l=0;
        int count1=0;
        int count0=0;
        int ans=0;
        int k=2;
        for(r=0;r<arr.length;r++){
            if(arr[r]==0){
                count0++;
            }
            else{
                count1++;
            }

            while(Math.min(count0,count1)>k){
                if(arr[l]==0){
                    count0--;
                }
                else{
                    count1--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);

        }
        System.out.println(ans);
    }
}

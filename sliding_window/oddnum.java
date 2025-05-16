

public class oddnum {
    public static void main(String[] args) {
        int [] arr={2,4,6,8};
        int r=0;
        int l=0;
        int ans=0;
        int k=1;
        int count=0;
        for(r=0;r<arr.length;r++){
            if(arr[r]%2!=0){
                count++;
            }
            while(count>k){
                if(arr[l]%2!=0){
                    count--;
                }
                l++;
            }
           ans+=r-l+1;
        }
        System.out.println(ans);
        
    }
}

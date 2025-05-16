public class greatest {
    public static char bs(char [] arr,char target){
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>target){
                r=mid-1;
            }
            else{
            l=mid+1;
            }
        }
        if(r==-1){
            return 'a';
        }else{
            return arr[r];
        }       
         
    }
        public static void main(String[] args) {
            char [] arr={'c','e','g','k','y'};
            char ans=bs(arr,'b');
            System.out.println(ans);

        
    }
}

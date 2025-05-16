public class maxweight {
    public static void main(String[] args) {
        int [] arr={1,8,3,7,5,6};
        int r=0;
        int l=0;
        int temp=0;
        int ans=0;
        for(r=0;r<arr.length;r++){
            temp+=arr[r];
            if(r-l==3){
                temp-=arr[l];
                l++;
            }
            if(r-l+1==3){
              ans=Math.max(ans,temp);

            }
        }
        System.out.println(ans);
    }
}

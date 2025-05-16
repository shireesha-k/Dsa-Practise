public class slidingwindow{
    public static void main(String[] args) {
        int [] nums={1,2,3,1,4};
        int l=0;
        int r=0;
        int count=0;
        int ans=0;
        for( r=0;r<nums.length;r++){
            ans+=nums[r];
            if(ans>=6){
                count++;
               }
            if(r-l==3){
                l++;
              }
              if(r-l+1==3){
              ans-=nums[l]; 
              
              }
        }
        System.out.println(count);
    }
}
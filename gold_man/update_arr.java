package gold_man;

public class update_arr {
    public static void main(String[] args) {
        int [] arr={0,1,2,3,4};
        int [] elements={5,6};
        int [] positions={2,4};
        int n=arr.length;
        int m=positions.length;

        int j=0;
        for(int i=0;i<n;i++){
            if(  j<m && arr[i]==(positions[j]-1) ){
                arr[i]=elements[j];
                j++;
                }
            }
            for(int x:arr){
                System.out.print(x+" ");
            }
    }
}

package gold_man;
import java.util.*;

public class delete_arr {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};                          
        int[] positions = {2, 4}; 

        Arrays.sort(positions);
        int n = arr.length;
        int m=positions.length;
        int [] result=new int[n-m];
            int j=0,k=0;
        for(int i=0;i<n;i++){
            if(j<m && i==positions[j]-1){
                j++;
            }else{
                result[k++]=arr[i];
            }
        }
       
        for(int x:result){
        System.out.print(x+" ");
     }
}
}    
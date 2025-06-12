package gold_man;

public class twodrow {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{7,8,9},{4,5,6}};
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] +" ");
            }
        }
    }
}

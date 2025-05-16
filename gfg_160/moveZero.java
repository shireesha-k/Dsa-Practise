public class moveZero {
    public static void main(String[] args) {
        int [] arr={1,2,3,0,0,5};
        int n=arr.length;
        int start=arr[0];
        int end=arr[n-1];
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                if(end!=0){
                start=arr[i];
                arr[i]=end;
                end=start;
                }
            }
            System.out.print(start);
            
            System.out.print(end);
            System.out.println(arr[i]);
        }
    }
}

package java_internal;

public class four {
    public static void main(String[] args){
        int arr []={20, 20, 30, 40, 50, 50, 50};
        int n=arr.length;
        int j=0;
        int [] temp=new int [20];
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j++]=arr[n-1];
        System.out.println("The new arrt id");
        for(int i=0;i<j;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.print("The new length :"+j);
    }
}

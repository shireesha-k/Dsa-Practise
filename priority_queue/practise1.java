package priority_queue;

import java.util.PriorityQueue;

public class practise1 {
    public static void main(String[] args) {
        PriorityQueue <Integer> sh=new PriorityQueue<>();
        sh.add(2);
        sh.add(10);
        sh.add(5);
        int toBeAdded[]={3,1,8};
        for(int i=0;i<toBeAdded.length;i++){
            sh.add(toBeAdded[i]);
            System.out.println("Chicha Removed "+ sh.poll());
        }
    }
}


// User function Template for Java

class Solution {
    int size(int arr[]){
        int cnt = 0;
        int i = 0;
        while(arr[i]!= '\0'){
            cnt++;
            i++;
        }
        return cnt;
    }
    void pushZerosToEnd(int[] arr) {
        // code here
        int i = 0;
        int n = size(arr);
        for(int j = 0;j<n;j++){
            if(arr[j] != 0){
                swap(arr[i],arr[j]);
                i++;
                
            }
        }
    }
};
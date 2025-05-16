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

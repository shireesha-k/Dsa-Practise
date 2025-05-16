package queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> sh=new LinkedList<>();
        sh.add("siri");
        sh.add("shireesha");
        for(String s:sh){
            System.out.println(s);
        }
        System.out.println(sh);
        sh.poll();
        System.out.println(sh.isEmpty());
        System.out.println(sh.size());
        System.out.println(sh.peek());
        System.out.println(sh);


    }
}

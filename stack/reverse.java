package stack;
import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        String s="shireesha";
        Stack <Character> sh= new Stack<>();
        for(int i=0;i<s.length();i++){
           System.out.println(sh.push(s.charAt(i)));
        }
        StringBuilder s1=new StringBuilder();
        while(!sh.isEmpty()){
            s1.append(sh.pop());
        }
        System.out.println(s1);
    }
}

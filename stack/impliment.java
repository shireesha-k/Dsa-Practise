package stack;
import java.util.Stack;
public class impliment {
    public static void main(String[] args) {
        Stack <String> sh=new Stack<>();
        sh.push("apple");
        sh.push("doll");
        sh.push("siri");
        System.out.println(sh);
        sh.pop();
        System.out.println(sh);
        System.out.println(sh.size());
        System.out.println(sh.isEmpty());
        for(String s:sh){

            System.out.println(sh);
        }
        while(!sh.isEmpty()){
            System.out.println(sh.pop());
        }
    }
}

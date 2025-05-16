package stack

import java.util.Stack;

&queue;
class macha
    {
int age;
String name;
macha(int age,string name){
    this.age=age;
    this.name=name;
}
    
}
public class first {
    public static void main(String[] args) {
        macha m1=new macha(1, "siri");
        macha m2=new macha(1, "hello");
        Stach <String> sh=new Stack<>();
        sh.push(m1);
        sh.push(m2);
        macha temp=sh.pop();
        System.out.println(temp.age);
    }
}

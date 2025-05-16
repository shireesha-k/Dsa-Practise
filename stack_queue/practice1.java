package stack_queue;

import java.util.Stack;

class Cricketer{
    String name;
    int runs;
    String nickname;
    Cricketer(String name,int runs,String nickname){
        this.name=name;
        this.runs=runs;
        this.nickname=nickname;
    }
}
public class practice1 {
    public static void main(String[] args) {
        String name[]={"vignesh","Dinesh","Arjun","Pavan"};
        int runs[]={0,100,45,10};
        String nickname[]={"Boom","Bam","Vim","vum"};
         Stack <String> sh=new Stack<>();
        for(int i=0;i<name.length;i++){
            Cricketer c1=new Cricketer(name[i],runs[i],nickname[i]);
            System.out.println(sh.push(c1.name));
        }
    
        
        
    }
}

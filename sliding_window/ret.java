
import java.util.Scanner;
public class ret{
    public boolean validate(String a,String b){
        if(a.equals(b)){
           return true;
        }

        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ret obj=new ret();
        System.out.println("entre your string");
        String a=sc.nextLine();
        System.out.println("enter your second string");
        String b=sc.nextLine();
        boolean c=obj.validate(a,b);
        System.out.println(c);

      sc.close();
    }
}

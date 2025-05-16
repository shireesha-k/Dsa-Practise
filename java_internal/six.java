package java_internal;
import java.util.Scanner;
class Area{
    int length;
    int breadth;
    void setDim(int l,int b){
        length=l;
        breadth=b;
    }
    int getArea(){
        return length*breadth;

    }
}
public class six {
    public static void main(String[] args){
        Area a =new Area();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        System.out.println("enter breadth");
        int b=sc.nextInt();
        a.setDim(l, b);
        System.out.println("Area of the reactanfle"+ a.getArea());


    }
}

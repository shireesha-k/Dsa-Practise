package java_internal;
class MethodOverloading{
    void add(int a,int b){
        System.out.println("summ is :"+(a+b));
    }
    void add(double a,double b){
        System.out.println("sum is :"+(a+b));
    }
}
public class ten {
    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        m.add(10,20);
        m.add(30,10.5);
    }
}

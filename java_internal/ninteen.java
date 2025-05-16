package java_internal;

public class ninteen {
    public static void main(String[] args){
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("c"+c);
            int arr []={1,2,3};
            System.out.println(arr[5]);
        }catch(ArithmeticException e){
            System.out.println("Can not divideby Zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bound");
        }finally{
            System.out.println("This block always runs");
        }
    }
}

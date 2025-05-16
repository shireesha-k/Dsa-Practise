package java_internal;
final class Student{
    final String name="Shireesha";
    final void display(){
        System.out.println("final method,name,class cannot be cahnged :"+name);
    }
}
public class seventeen {
    public static void main(String[] args) {
        Student s=new Student();
        s.display();
    }
}

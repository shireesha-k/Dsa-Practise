package java_internal;
class Student{
    String name="Shireessha";
    String rollno="23011A6660";
    int age=18;
    String dept="CSE";
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Roll no"+rollno);
        System.out.println("age: "+age);
        System.out.println("Department"+dept);
    }
}
public class five {
    public static void main(String[] args){
        Student s=new Student();
        s.display();
    }
}

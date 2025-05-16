package java_internal;
class Student{
    String name="Shireesha";
    int age=18;
    Student(String n,int a){
        name=n;
        age=a;
    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }
}
public class elleven {
    public static void main(String[] atgs){
        Student s1=new Student("shireesa",18);
        Student s2=new Student(s1);
        System.out.println("Name is "+s2.name+" and age is "+s2.age);
    }
}

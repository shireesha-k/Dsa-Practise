package java_internal;
class Person{
    String name;
    int age;
    Person(String n,int a){
        name=n;
        age=a;
    }
    void display(){
        System.out.println("My Name is "+ name+" and my age is "+age);
    }
}
public class eight {
    public static void main(String[] args) {
        Person p1=new Person("Shireesha", 18);
        Person p2=new Person("rithika",24 );
        p1.display();
        p2.display();
    }
}

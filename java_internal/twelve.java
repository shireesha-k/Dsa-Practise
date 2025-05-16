package java_internal;
 class Student{
       String name="shireesha";
       int age=18;
       Student(String n,int a){
        name=n;
        age=a;
       }
       void isEquals(Student s){
        if(this.name.equals(s.name) && this.age==s.age){
            System.out.println("Both are same");
        }
        else{
            System.out.println("  Both are Not same");
        }
       }
 }
public class twelve {
    public static void main(String[] args){
    Student s1=new Student("shireesha",18);
    Student s2=new Student("shireesha",18);
    Student s3=new Student("Rithika",24);
    s1.isEquals(s2);
    s2.isEquals(s3);
    }

}

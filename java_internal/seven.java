package java_internal;
class Employee{
    String name="shireesha";
    String jobtitle="ledhamma";
    int salary=1500000;
    void updateSalary(int increment){
        salary+=increment;
    }
    void calculate(){
        System.out.println("update salary after increment"+salary);
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Job title :"+jobtitle);
        System.out.println("Salary :"+salary);
    }
}
public class seven {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.updateSalary(5000);
        e.calculate();
        e.display();

    }
}

package java_internal;

abstract class Employee {
    abstract void calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    double base = 50000;
    String name="shirreesha";
    int id=101;
    void calculateSalary() {
        System.out.println("Manager Salary: " + (base + 0.2 * base));
    }

    void displayInfo() {
        System.out.println("Manager Name: " + name + ", ID: " + id);
    }
}

class Programmer extends Employee {
    double base = 40000;
    String name="rithika";
    int id=102;

    void calculateSalary() {
        System.out.println("Programmer Salary: " + (base + 0.15 * base));
    }

    void displayInfo() {
        System.out.println("Programmer Name: " + name + ", ID: " + id);
    }
}

public class fifteen {
    public static void main(String[] args) {
        Manager m = new Manager();
        Programmer p = new Programmer();

        m.displayInfo();
        m.calculateSalary();

        p.displayInfo();
        p.calculateSalary();
    }
}


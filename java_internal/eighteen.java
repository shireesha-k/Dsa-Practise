package java_internal;
class Animal {
    String type = "Animal";
    Animal() {
        System.out.println("Animal constructor called");
    }
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    String type = "Dog";
    Dog() {
        super(); // 1. Call parent constructor
        System.out.println("Dog constructor called");
    }

    void printType() {
        System.out.println("Type from subclass: " + type);
        System.out.println("Type from superclass: " + super.type); // 2. Access parent variable
    }
    void sound() {
        super.sound(); // 3. Call parent method
        System.out.println("Dog barks");
    }
}

public class eighteen {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printType();
        d.sound();
    }
}

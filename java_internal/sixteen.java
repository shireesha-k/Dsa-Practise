package java_internal;
class Animal{
    void eat(){
        System.out.println("this is animal class eat method");
    }
    void sound(){
        System.out.println("this is animal class sound method");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println("lion eating..");
    }
    void sound(){
        System.out.println("lion roaring..");
    }
}
class Tiger extends Animal{
    void eat(){
        System.out.println("tiger eating..");
    }
    void sound(){
        System.out.println("tiger roaring..");
    }
}
class Panther extends Animal{
    void eat(){
        System.out.println("panther eating..");
    }
    void sound(){
        System.out.println("panther roaring..");
    }

    
}
public class sixteen {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();
        a.sound();
        Lion l=new Lion();
        l.eat();
        l.sound();
        Tiger t=new Tiger();
        t.eat();
        t.sound();
        Panther p=new Panther();
        p.eat();
        p.sound();
    }
}

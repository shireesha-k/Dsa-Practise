package java_internal;
 abstract class Shape{
       abstract void calculateArea();
       abstract void calculatePerimeter();

 }
 class Circle extends Shape{
     double r=3;
     void calculateArea(){
        System.out.println("Area of cicrcle is "+(3.14*r*r));
     }
     void calculatePerimeter(){

        System.out.println("Perimeter is"+(2*3.14*r));
     }
 }
 class Triangle extends Shape{
   double a=4;
   double b=5;
   double c=6;
   double height=3;
   void calculateArea(){
        System.out.println("Area of traingle is "+(0.5*a*height));
   }
   void calculatePerimeter(){
       System.out.println("perimeter of the trainagle is "+(a+b+c));
   }
 }
public class thirteen {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.calculateArea();
        c.calculatePerimeter();

        Triangle t=new Triangle();
         t.calculateArea();   
         t.calculatePerimeter(); 

        }
}

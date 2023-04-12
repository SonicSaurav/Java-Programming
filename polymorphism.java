public class polymorphism {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area();
        Shapes sq1 = new Square();
        sq1.area(); 
    }
}
class Shapes{
 void area(){
   System.out.println("i am in shapes");
 }
}
class Circle extends Shapes{
void area(){
    System.out.println("Area is pie * r * r");
}
}
class Triangle extends Shapes{
    void area(){
        System.out.println("Area is 1/2 * b * h");
    }
}
class Square extends Shapes{
    void area(){
        System.out.println("Area is side * side");
    }
}
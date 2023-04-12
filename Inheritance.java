public class Inheritance {
public static void main(String[] args) {
    Box box1 = new Box();
    Box box2 = new Box(box1);
    box1.height = 5.0;
    box1.info();
    box2.info();
    BoxWeight box3 = new BoxWeight();
    box3.info();
    System.out.println(box3.weight);
    BoxPrice box4 = new BoxPrice();
    box4.info();
    System.out.println(box4.price);
}
}
class Box{
    double length;
    double height;
    double width;
    Box(){
        this.height = -1;
        this.length=-1;
        this.width=-1;
    }
    Box(double side){
        this.width=side;
        this.length=side;
        this.height=side;
    }
    Box(double length,double height,double width){
        this.length=length;
        this.height=height;
        this.width=width;
    }
    Box(Box oth){
        this.length=oth.length;
        this.width=oth.width;
        this.height=oth.height;
    }
    void info(){
        System.out.println("Height is "+ this.height);
        System.out.println("Width is " + this.width);
        System.out.println("Length is "+ this.length);
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        super();
        this.weight=-1;
    }
    BoxWeight(double length,double height,double width,double weight){
        super(length, height, width);
        this.weight = weight;
    }
    void info(){
        super.info();
        System.out.println("weight is "+ this.weight);

    }
}
class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(double length,double height,double width,double weight,double price){
        super(length,height,width,weight);
        this.price = price;
    }
    BoxPrice(){
        super();
        this.price = 0;

    }
}
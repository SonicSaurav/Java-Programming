public class AbstractClasses {
    public static void main(String[] args) {
        Son n =  new Son();
        n.sonic();
        n.career("Sonic");
        n.partner();
    }
}
abstract class Parent{
    abstract void career(String name);
    void sonic(){
        System.out.println("xd");
    }
    abstract void partner();
}
class Son extends Parent{
    void career(String name){
        System.out.println(name + " is a programmer");
    }
    void partner(){
        System.out.println("He is single");
    }
}
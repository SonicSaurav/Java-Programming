public class Cloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sonic= new Human(21,"Sonic");
        Human sonic2 = new Human(sonic);
        Human sonic3 = (Human)sonic.clone();
        sonic.name = "Saurav";
        System.out.println(sonic.name);
        System.out.println(sonic2.name);
        System.out.println(sonic3.name);

    }
}
class Human implements Cloneable{
    int age;
    String name;
    Human(int age , String name){
        this.age = age;
        this.name = name;
    }
    Human(Human h){
        this.age = h.age;
        this.name = h.name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

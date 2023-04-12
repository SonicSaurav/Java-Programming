import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
        list.add(33);
        System.out.println(list.get(0));
        Printer printer = new Printer();
        printer.thingstoprint(5);
        Printer printer2 = new Printer();
        printer2.thingstoprint("Hello");
        Sonic<Integer> sonic = new Sonic<>();
        System.out.println(sonic.ratio(5));
    }
}
class Printer {
    <T> void thingstoprint(T thingtoprint){
        System.out.println(thingtoprint + " is a thing");
        
    }
}
class Sonic<T>{
    T stats;
    T ratio(T ratio){
        this.stats = ratio;
        return stats;
    }
}
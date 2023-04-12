import java.util.*;
public class HashSets {
    public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    set.add(5);
    set.add(10);
    set.add(10);
    System.out.println(set);
    set.remove(10);
    System.out.println(set);
    }
    
}
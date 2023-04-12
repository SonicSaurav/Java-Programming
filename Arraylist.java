import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(1,8);
        list.remove(Integer.valueOf(8));
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Sonic");
        list1.add("Shikhar");
        list1.remove(String.valueOf("Shikhar"));
        System.out.println(list1);
        Iterator<Integer> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());
        Iterator<String> it1 = list1.iterator();
        it1.next();
        it1.remove();
        System.out.println(list1);
    }
}

import java.util.*;
public class Maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "John");
        map.put("age", "30");
        map.put("name", "Jane");
        System.out.println(map);
        System.out.println(map.get("name"));
        System.out.println(map.get("age"));
        System.out.println(map.get("address"));
        System.out.println(map.getOrDefault("address", "Unknown"));
        map.remove("name");
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}

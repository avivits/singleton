package class5;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("avi", "Aa123456");
       boolean b = users.containsKey("admin");
        System.out.println(b);
        System.out.println(users.get("admin"));
//
//        Map<Integer, String> sabanFamily = new HashMap<>();
//        sabanFamily.put(42, "Avivit");
//        sabanFamily.put(40, "Erez");
//        sabanFamily.put(5, "Ari");
//        sabanFamily.put(2, "Alona");
//        System.out.println(sabanFamily.get(42));
//        System.out.println(sabanFamily.get(40));
//        System.out.println(sabanFamily.get(5));
//        System.out.println(sabanFamily.get(2));
//        System.out.println(sabanFamily.values());

    }
}

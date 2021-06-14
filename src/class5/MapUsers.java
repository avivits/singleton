package class5;

import java.util.HashMap;
import java.util.Map;

public class MapUsers {
    public static void main(String[] args) {

        Map<String , String> users = new HashMap();
        users.put("user1" , "123");
        users.put("user2" , "456");
        users.put("user3" , "789");

        System.out.println(users.get("user1"));
        System.out.println(users.get("user2"));
        System.out.println(users.get("user3"));


    }
}

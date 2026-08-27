package collection;

import java.util.HashMap;

public class Exercise4_HashMap {
    public static void main(String[] args) {
        System.out.println("\n===== 练习四 =====");

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1001, "iPhone 15");
        hashMap.put(1002, "iPad Air");
        hashMap.put(1003, "MacBook Pro");

        System.out.println(hashMap.get(1002));
        System.out.println(hashMap.get(1004));
        hashMap.put(1001, "iPhone 15 Pro");
        System.out.println(hashMap);
    }
}

package collection;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Exercise5_OrderMap {
    public static void main(String[] args) {
        System.out.println("\n===== 练习五 =====");

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.put("C", 3);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get("B"));
        System.out.println(linkedHashMap); // 刚刚被访问过的元素会被移到双向链表的尾部

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(90, "优秀");
        treeMap.put(60, "及格");
        treeMap.put(80, "良好");
        System.out.println(treeMap);
    }
}

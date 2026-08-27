package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Exercise3_Set {
    public static void main(String[] args) {
        System.out.println("\n===== 练习三 =====");

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Apple", "Banana", "Orange", "Apple", "Grape", "Banana");
        System.out.println("原始列表:" + list);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(list);
        System.out.println("HashSet去重后:" + hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(list);
        System.out.println("LinkedHashSet去重后:" + linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(list);
        System.out.println(treeSet.add("Apple"));
        System.out.println("TreeSet去重后:" + treeSet);
    }
}

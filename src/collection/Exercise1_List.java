package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise1_List {
    public static void main(String[] args) {
        System.out.println("\n===== 练习一 =====");
        List<Integer> list = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            list.add(i);
            linkedList.add(i);
        }

        long start = System.nanoTime();
        System.out.println(list.get(50000));
        long end = System.nanoTime();
        System.out.println("ArrayList 随机读取时间: " + (end - start) + " 纳秒");

        start = System.nanoTime();
        System.out.println(linkedList.get(50000));
        end = System.nanoTime();
        System.out.println("LinkedList 随机读取时间: " + (end - start) + " 纳秒");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.addFirst(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList 插入时间: " + (end - start) + " 纳秒");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.addFirst(i);
        }
        end = System.nanoTime();
        System.out.println("LinedList 插入时间: " + (end - start) + " 纳秒");
    }
}

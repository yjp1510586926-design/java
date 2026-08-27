import collection.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("A");
        list.add("C");
        list.add("D");
        list.add(1, "B");
        System.out.println("链表大小: " + list.size()); // 4
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
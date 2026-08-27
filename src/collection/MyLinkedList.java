package collection;

public class MyLinkedList {
    private static class Node {
        Object item;
        Node next;

        Node(Object item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node head = null;
    private int size = 0;

    // 追加到链表尾部
    public void add(Object value) {
        add(size, value);
    }

    // 插入到指定索引位置
    public void add(int index, Object value) {

        if (index == 0) {
            head = new Node(value, head);
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            prev.next = new Node(value, prev.next);
        }
        size++;
    }

    public Object get(int index) {
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.item;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("A");
        list.add("c");
        list.add("D");
        list.add("B");
        System.out.println("链表大小：" + list.size());
        System.out.println("索引2的内容：" + list.get(2));

    }
}
